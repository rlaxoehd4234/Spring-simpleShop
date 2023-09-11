package com.shop.simpleshop.mapper;

import com.shop.simpleshop.dto.user.UserSignUpDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public int signUp(UserSignUpDto userSignUpDto);
}
