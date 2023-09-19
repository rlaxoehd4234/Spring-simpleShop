package com.shop.simpleshop.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestUpdateDto {
    private int user_no;
    private String address;
    private String email;
}
