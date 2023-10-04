package com.shop.simpleshop.service;

import com.shop.simpleshop.dto.user.*;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {
     int signUpUser(UserSignUpDto userSignUpDto);
     String loginUser(UserLoginDto userLoginDto);
     int updateUserInfo(UserRequestUpdateDto userRequestUpdateDto);
     int deleteUser(HttpSession session);
     UserResponseInfoDto infoUser(String userId);
     List<UserResponseListDto> findAllUser();

}
