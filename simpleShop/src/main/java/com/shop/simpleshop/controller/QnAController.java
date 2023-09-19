package com.shop.simpleshop.controller;

import com.shop.simpleshop.dto.QnA.QnARequestSaveDto;
import com.shop.simpleshop.dto.QnA.QnAResponseInfoDto;
import com.shop.simpleshop.dto.QnA.QnAResponseListDto;
import com.shop.simpleshop.service.QnAService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/api/qna")
@RequiredArgsConstructor
public class QnAController {
    private final QnAService qnAService;


    @ApiOperation(value = "QnA 등록" , notes = "정상 작동시 1 리턴")
    @ApiResponses({
            @ApiResponse(code = 200 , message = "정상 등록 완료"),
            @ApiResponse(code = 400 , message = "로그인 하지 않은 유저")
    })
    @PostMapping("/save")
    public ResponseEntity<Integer> saveQnA(@RequestBody QnARequestSaveDto qnARequestSaveDto, HttpSession session){
        return ResponseEntity.ok().body(qnAService.saveQnA(qnARequestSaveDto, session));
    }

    @ApiOperation(value = "QnA 리스트 반환", notes = "정상 작동 시 리스트 반환")
    @ApiResponses({
            @ApiResponse(code = 200 , message = "정상 반환 완료"),
            @ApiResponse(code = 400 , message = "로그인 하지 않은 유저")
    })
    @GetMapping("/findAllQnA")
    public ResponseEntity<List<QnAResponseListDto>> findAllQnA(){
        return ResponseEntity.ok().body(qnAService.findAllQnA());
    }
    @ApiOperation(value = "QnA 상세 정보 가져오기", notes = "정상 작동 시 QnAResponseInfoDto 반환")
    @ApiResponses({
            @ApiResponse(code = 200, message = "정상 반환 완료"),
            @ApiResponse(code = 400, message = "로그인 하지 않은 유저")
    })
    @GetMapping("/findInfo/{qnaNo}")
    public ResponseEntity<QnAResponseInfoDto> findInfo(@PathVariable("qnaNo") int qna_no){
        return ResponseEntity.ok().body(qnAService.findInfo(qna_no));
    }

    @ApiOperation(value = "QnA 삭제" , notes = "정상 작동 시 1리턴 ")
    @ApiResponses({
            @ApiResponse(code = 200, message = "정상 삭제 완료"),
            @ApiResponse(code = 400 , message = "로그인 하지 않은 유저"),
            @ApiResponse(code = 401, message = "권한이 없는 유저")
    })
    @DeleteMapping("/delete/{qna_no}")
    public ResponseEntity<Integer> deleteQnA(@PathVariable("qna_no") int qna_no ,HttpSession session){
        return ResponseEntity.ok().body(qnAService.deleteQnA(qna_no, session));
    }
}
