package com.shop.simpleshop.service;

import com.shop.simpleshop.dto.item.ItemSaveDto;
import com.shop.simpleshop.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
    private final ItemMapper itemMapper;

    @Override
    public int saveItem(ItemSaveDto itemSaveDto, HttpSession session) {
        itemSaveDto.setWriter((String) session.getAttribute("id"));
        return itemMapper.saveItem(itemSaveDto);
    }

    @Override
    public int deleteItem(int itemId) {
        return itemMapper.deleteItem(itemId);
    }
}
