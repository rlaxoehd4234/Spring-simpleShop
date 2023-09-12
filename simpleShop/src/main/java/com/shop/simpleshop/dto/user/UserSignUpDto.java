package com.shop.simpleshop.dto.user;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSignUpDto {
    private String id;
    private String password;
    private String name;
    private int age;
    private String address;
    private String email;
}
