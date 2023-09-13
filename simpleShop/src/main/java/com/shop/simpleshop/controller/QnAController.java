package com.shop.simpleshop.controller;

import com.shop.simpleshop.dto.QnA.QnARequestSaveDto;
import com.shop.simpleshop.dto.QnA.QnAResponseInfoDto;
import com.shop.simpleshop.dto.QnA.QnAResponseListDto;
import com.shop.simpleshop.service.QnAService;
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
    @PostMapping("/save")
    public ResponseEntity<Integer> saveQnA(@RequestBody QnARequestSaveDto qnARequestSaveDto, HttpSession session){
        return ResponseEntity.ok().body(qnAService.saveQnA(qnARequestSaveDto, session));
    }
    @GetMapping("/findAllQnA")
    public ResponseEntity<List<QnAResponseListDto>> findAllQnA(){
        return ResponseEntity.ok().body(qnAService.findAllQnA());
    }
    @GetMapping("/findInfo/{qnaNo}")
    public ResponseEntity<QnAResponseInfoDto> findInfo(@PathVariable("qnaNo") int qna_no){
        return ResponseEntity.ok().body(qnAService.findInfo(qna_no));
    }
}
