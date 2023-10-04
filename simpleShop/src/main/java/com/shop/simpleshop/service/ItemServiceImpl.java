package com.shop.simpleshop.service;

import com.shop.simpleshop.dto.item.*;
import com.shop.simpleshop.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.List;

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

    @Override
    public int updateItem(int itemId, ItemUpdateDto itemUpdateDto) {
        return itemMapper.updateItem(itemId, itemUpdateDto);
    }

    @Override
    public List<ItemResponseListDto> findAllItem() {
        return itemMapper.findAllItem();
    }

    @Override
    public List<ItemResponseAnalDto> analWriter() {
        return itemMapper.analWriter();
    }

    @Override
    public ItemResponseFindByIdDto findById(int itemId) {
        return itemMapper.findById(itemId);
    }

    @Override
    public List<ItemResponseListDto> findByStar() {
        return itemMapper.findByStar();
    }
}
