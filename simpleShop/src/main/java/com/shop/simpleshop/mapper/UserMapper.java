package com.shop.simpleshop.mapper;

import com.shop.simpleshop.dto.user.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
     int signUp(UserSignUpDto userSignUpDto);
     String login(UserLoginDto userLoginDto);
     int findById(String id);
     int updateUserInfo(UserRequestUpdateDto userRequestUpdateDto);
     int deleteUser(int user_no);
     UserResponseInfoDto infoUser(int user_no);
     List<UserResponseListDto> findAllUser();
}
