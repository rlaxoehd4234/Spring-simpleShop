package com.shop.simpleshop.controller;

import com.shop.simpleshop.dto.item.ItemSaveDto;
import com.shop.simpleshop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;
    @PostMapping("/save")
    public ResponseEntity<Integer> saveItem(@RequestBody ItemSaveDto itemSaveDto, HttpSession session){
        return ResponseEntity.ok().body(itemService.saveItem(itemSaveDto,session));
    }
    // TODO: ITEM 삭제 로직 작성
    @DeleteMapping("/delete/{itemId}")
    public ResponseEntity<Integer> deleteItem(@PathVariable("itemId") int itemId){
        return ResponseEntity.ok().body(itemService.deleteItem(itemId));
    }

    // TODO: ITEM 추천 System


}
