package com.shop.simpleshop.mapper;

import com.shop.simpleshop.dto.user.UserLoginDto;
import com.shop.simpleshop.dto.user.UserRequestUpdateDto;
import com.shop.simpleshop.dto.user.UserSignUpDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
     int signUp(UserSignUpDto userSignUpDto);
     String login(UserLoginDto userLoginDto);
     int findById(String id);
     int updateUserInfo(UserRequestUpdateDto userRequestUpdateDto);
     int deleteUser(int user_no);

}
