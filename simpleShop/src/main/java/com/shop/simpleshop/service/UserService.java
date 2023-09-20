package com.shop.simpleshop.service;

import com.shop.simpleshop.dto.user.*;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {
     int signUpUser(UserSignUpDto userSignUpDto);
     String loginUser(UserLoginDto userLoginDto);
     int updateUserInfo(UserRequestUpdateDto userRequestUpdateDto, HttpSession session);
     int deleteUser(HttpSession session);
     UserResponseInfoDto infoUser(HttpSession session);
     List<UserResponseListDto> findAllUser();

}
