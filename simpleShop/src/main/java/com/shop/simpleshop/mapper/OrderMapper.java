package com.shop.simpleshop.mapper;

import com.shop.simpleshop.dto.order.OrderRequestDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    int saveOrder(OrderRequestDto orderRequestDto);
}
