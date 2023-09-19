package com.shop.simpleshop.service;

import com.shop.simpleshop.dto.user.UserLoginDto;
import com.shop.simpleshop.dto.user.UserRequestUpdateDto;
import com.shop.simpleshop.dto.user.UserSignUpDto;

import javax.servlet.http.HttpSession;

public interface UserService {
     int signUpUser(UserSignUpDto userSignUpDto);
     String loginUser(UserLoginDto userLoginDto);
     int updateUserInfo(UserRequestUpdateDto userRequestUpdateDto, HttpSession session);
     int deleteUser(HttpSession session);

}
