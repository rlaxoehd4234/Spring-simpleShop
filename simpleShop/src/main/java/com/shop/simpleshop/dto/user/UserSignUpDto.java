package com.shop.simpleshop.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserSignUpDto {
    private String id;
    private String password;
    private String name;
    private int age;
    private String address;
    private String email;
}
