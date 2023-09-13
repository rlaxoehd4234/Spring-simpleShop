package com.shop.simpleshop.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.shop.simpleshop.dto.order.OrderRequestDto;
import com.shop.simpleshop.service.OrderService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;

    @ApiOperation(value = "상품 주문" , notes = "상품 주문 성공시 1 리턴")
    @ApiResponses({
            @ApiResponse(code = 200, message = "주문 성공"),
            @ApiResponse(code = 400, message = "권한 없음"),
            @ApiResponse(code = 402, message = "주문 실패")
    })
    @PostMapping("/save/{itemNo}")
    public ResponseEntity<Integer> saveOrder(@PathVariable("itemNo") int itemNo, @RequestBody OrderRequestDto orderRequestDto, HttpSession session) throws JsonProcessingException {
        return ResponseEntity.ok().body(orderService.saveOrder(itemNo, orderRequestDto , session));
    }
}
