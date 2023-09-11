package com.shop.simpleshop.mapper;

import com.shop.simpleshop.dto.item.ItemSaveDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {
    int saveItem(ItemSaveDto itemSaveDto);
    int deleteItem(int itemId);
}
