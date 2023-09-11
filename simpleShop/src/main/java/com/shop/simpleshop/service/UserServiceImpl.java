package com.shop.simpleshop.service;


import com.shop.simpleshop.dto.user.UserSignUpDto;
import com.shop.simpleshop.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    @Override
    public int signUpUser(UserSignUpDto userSignUpDto) {
        return userMapper.signUp(userSignUpDto);
    }
}
