package com.shop.simpleshop.controller;

import com.shop.simpleshop.dto.item.*;
import com.shop.simpleshop.service.ItemService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/api/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;
    @ApiOperation(value ="상품 등록", notes ="상품 등록 정상 작동시 1 리턴")
    @ApiResponses({
            @ApiResponse(code = 200 , message = "API 정상 작동"),
            @ApiResponse(code = 400 , message = "권한 없음"),
            @ApiResponse(code = 500 , message = "서버 에러")
    })
    @PostMapping("/save")
    public ResponseEntity<Integer> saveItem(@RequestBody ItemSaveDto itemSaveDto, HttpSession session){
        return ResponseEntity.ok().body(itemService.saveItem(itemSaveDto,session));
    }
    @ApiOperation(value ="상품 삭제", notes ="상품 삭제 정상 작동시 1 리턴")
    @ApiResponses({
            @ApiResponse(code = 200 , message = "API 정상 작동"),
            @ApiResponse(code = 400 , message = "권한 없음"),
            @ApiResponse(code = 500 , message = "서버 에러")
    })
    @DeleteMapping("/delete/{itemId}")
    public ResponseEntity<Integer> deleteItem(@PathVariable("itemId") int itemId){
        return ResponseEntity.ok().body(itemService.deleteItem(itemId));
    }


    @ApiOperation(value ="상품 업데이트", notes ="상품 삭제 정상 작동시 1리턴")
    @ApiResponses({
            @ApiResponse(code = 200, message = "API 정상 작동"),
            @ApiResponse(code = 400, message = "권한 없음"),
            @ApiResponse(code = 500, message = "서버 에러")
    })
    @PatchMapping("/update/{itemId}")
    public ResponseEntity<Integer> updateItem(@PathVariable("itemId") int itemId, @RequestBody ItemUpdateDto itemUpdateDto){
        return ResponseEntity.ok().body(itemService.updateItem(itemId,itemUpdateDto));
    }

    @ApiOperation(value = "상품 리스트", notes = "상품 리스트 정상 작동시 리스트 리턴")
    @ApiResponses({
            @ApiResponse(code = 200, message = "API 정상 작동"),
            @ApiResponse(code = 400, message = "권한 없음"),
            @ApiResponse(code = 500, message = "서버 에러")
    })
    @GetMapping("/findAll")
    public ResponseEntity<List<ItemResponseListDto>> findAllItem(){
        return ResponseEntity.ok().body(itemService.findAllItem());
    }

    @GetMapping("/findById/{item_id}")
    public ResponseEntity<ItemResponseFindByIdDto> findById(@PathVariable Integer item_id){
        return ResponseEntity.ok().body(itemService.findById(item_id));
    }

    @GetMapping("/anal/writer")
    public ResponseEntity<List<ItemResponseAnalDto>> findAnalWriter(){
        return ResponseEntity.ok().body(itemService.analWriter());
    }

    @GetMapping("/findByStar")
    public ResponseEntity<List<ItemResponseListDto>> findByStar(){
        return ResponseEntity.ok().body(itemService.findByStar());
    }


}
