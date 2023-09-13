package com.shop.simpleshop.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shop.simpleshop.dto.order.OrderItemListDto;
import com.shop.simpleshop.dto.order.OrderRequestDto;
import com.shop.simpleshop.mapper.OrderMapper;
import com.shop.simpleshop.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderMapper orderMapper;
    private final UserMapper userMapper;
    @Override
    public int saveOrder(int itemNo, OrderRequestDto orderRequestDto, HttpSession session) throws JsonProcessingException {
        ArrayList<OrderItemListDto> list = new ArrayList<>();
        list.add(new OrderItemListDto(itemNo, orderRequestDto.getCount()));
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(list);
        orderRequestDto.setItems(json);
        orderRequestDto.setUser_no(userMapper.findById((String) session.getAttribute("id")));
        return orderMapper.saveOrder(orderRequestDto);
    }
}
