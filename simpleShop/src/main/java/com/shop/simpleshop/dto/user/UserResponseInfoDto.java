package com.shop.simpleshop.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponseInfoDto {
    private String name;
    private int age;
    private String address;
    private String email;
}
