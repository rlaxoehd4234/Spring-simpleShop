package com.shop.simpleshop.mapper;

import com.shop.simpleshop.dto.item.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    int saveItem(ItemSaveDto itemSaveDto);
    int deleteItem(int itemId);
    int updateItem(int itemId,ItemUpdateDto itemUpdateDto);
    List<ItemResponseListDto> findAllItem();
    List<ItemResponseAnalDto> analWriter();
    ItemResponseFindByIdDto findById(int itemId);
    List<ItemResponseListDto> findByStar();

}
