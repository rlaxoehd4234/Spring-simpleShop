package com.shop.simpleshop.dto.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemResponseListDto {
    private int item_no;
    private String name;
    private int sellCount;
    private int cartCount;
    private String writer;
    private int price;
    private int stock;
    private String itemDetail;
    private String regDate;
}
