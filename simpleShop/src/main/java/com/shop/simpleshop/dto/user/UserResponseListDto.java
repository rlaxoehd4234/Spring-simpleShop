package com.shop.simpleshop.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseListDto {
    private String name;
    private String email;
    private String crexteDate;
    private int age;

}
