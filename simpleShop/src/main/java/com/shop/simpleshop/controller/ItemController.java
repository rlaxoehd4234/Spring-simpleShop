package com.shop.simpleshop.controller;

import com.shop.simpleshop.dto.item.ItemSaveDto;
import com.shop.simpleshop.service.ItemService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

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
    // TODO: ITEM 삭제 로직 작성
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

    // TODO: ITEM 추천 System

    // TODO: R 구현

    // TODO: D 구현

    // TODO: U 구현


}
