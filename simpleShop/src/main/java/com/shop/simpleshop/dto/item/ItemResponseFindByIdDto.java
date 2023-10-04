package com.shop.simpleshop.dto.item;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Getter
@Setter
public class ItemResponseFindByIdDto {
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
