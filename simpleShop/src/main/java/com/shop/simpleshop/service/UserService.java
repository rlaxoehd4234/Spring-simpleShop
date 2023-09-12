package com.shop.simpleshop.service;

import com.shop.simpleshop.dto.user.UserLoginDto;
import com.shop.simpleshop.dto.user.UserSignUpDto;

public interface UserService {
     int signUpUser(UserSignUpDto userSignUpDto);
     String loginUser(UserLoginDto userLoginDto);
}
