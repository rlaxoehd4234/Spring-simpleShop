package com.shop.simpleshop.dto.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class ItemSaveDto {
    private String name;
    @NotNull
    private int price;
    private String itemDetail;
    private String writer;
    @NotNull
    private int stock;
}
