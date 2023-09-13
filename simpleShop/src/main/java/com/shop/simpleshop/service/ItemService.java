package com.shop.simpleshop.service;

import com.shop.simpleshop.dto.item.ItemResponseAnalDto;
import com.shop.simpleshop.dto.item.ItemResponseListDto;
import com.shop.simpleshop.dto.item.ItemSaveDto;
import com.shop.simpleshop.dto.item.ItemUpdateDto;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface ItemService {
    int saveItem(ItemSaveDto itemSaveDto, HttpSession session);
    int deleteItem(int itemId);
    int updateItem(int itemId,ItemUpdateDto itemUpdateDto);
    List<ItemResponseListDto> findAllItem();
    List<ItemResponseAnalDto> analWriter();

}
