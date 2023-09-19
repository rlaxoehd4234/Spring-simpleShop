package com.shop.simpleshop.service;


import com.shop.simpleshop.dto.user.UserLoginDto;
import com.shop.simpleshop.dto.user.UserRequestUpdateDto;
import com.shop.simpleshop.dto.user.UserSignUpDto;
import com.shop.simpleshop.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    @Override
    public int signUpUser(UserSignUpDto userSignUpDto) {
        return userMapper.signUp(userSignUpDto);
    }

    @Override
    public String loginUser(UserLoginDto userLoginDto) {
        return userMapper.login(userLoginDto);
    }

    @Override
    public int updateUserInfo(UserRequestUpdateDto userRequestUpdateDto, HttpSession session) {
        userRequestUpdateDto.setUser_no(userMapper.findById((String) session.getAttribute("id")));
        return userMapper.updateUserInfo(userRequestUpdateDto);
    }

    @Override
    public int deleteUser(HttpSession session) {
        return userMapper.deleteUser(userMapper.findById((String) session.getAttribute("id")));
    }
}
