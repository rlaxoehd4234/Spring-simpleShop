package com.shop.simpleshop.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.shop.simpleshop.dto.order.OrderRequestDto;

import javax.servlet.http.HttpSession;

public interface OrderService {
    int saveOrder(int itemNo, OrderRequestDto orderRequestDto, HttpSession session) throws JsonProcessingException;
}
