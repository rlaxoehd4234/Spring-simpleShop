package com.shop.simpleshop.mapper;

import com.shop.simpleshop.dto.item.ItemResponseAnalDto;
import com.shop.simpleshop.dto.item.ItemResponseListDto;
import com.shop.simpleshop.dto.item.ItemSaveDto;
import com.shop.simpleshop.dto.item.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    int saveItem(ItemSaveDto itemSaveDto);
    int deleteItem(int itemId);
    int updateItem(int itemId,ItemUpdateDto itemUpdateDto);
    List<ItemResponseListDto> findAllItem();
    List<ItemResponseAnalDto> analWriter();
}
