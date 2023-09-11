package com.shop.simpleshop.service;

import com.shop.simpleshop.dto.item.ItemSaveDto;

import javax.servlet.http.HttpSession;

public interface ItemService {
    int saveItem(ItemSaveDto itemSaveDto, HttpSession session);
    int deleteItem(int itemId);
}
