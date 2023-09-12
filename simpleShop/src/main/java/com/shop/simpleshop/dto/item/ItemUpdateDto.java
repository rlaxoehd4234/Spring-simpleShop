package com.shop.simpleshop.dto.item;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemUpdateDto {
    private String name;
    private int price;
    private int stock;
    private String writer;
    private String itemDetail;
}
