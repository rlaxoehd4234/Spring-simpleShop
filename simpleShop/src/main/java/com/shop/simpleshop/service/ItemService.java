package com.shop.simpleshop.service;

import com.shop.simpleshop.dto.item.*;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface ItemService {
    int saveItem(ItemSaveDto itemSaveDto, HttpSession session);
    int deleteItem(int itemId);
    int updateItem(int itemId,ItemUpdateDto itemUpdateDto);
    List<ItemResponseListDto> findAllItem();
    List<ItemResponseAnalDto> analWriter();
    ItemResponseFindByIdDto findById(int itemId);
    List<ItemResponseListDto> findByStar();

}
