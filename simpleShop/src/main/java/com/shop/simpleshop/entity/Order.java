package com.shop.simpleshop.entity;

import java.util.Map;

public class Order {
    private int order_no;
    private int user_no;
    private String regDate;
    private String status;
    private Map<String,Object> items;
}
