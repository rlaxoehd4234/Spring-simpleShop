package com.shop.simpleshop.controller;

import com.shop.simpleshop.dto.user.UserLoginDto;
import com.shop.simpleshop.dto.user.UserSignUpDto;
import com.shop.simpleshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("/signUp")
    public ResponseEntity<Integer> save(@RequestBody UserSignUpDto userSignUpDto){
        return ResponseEntity.ok().body(userService.signUpUser(userSignUpDto));
    }
    @GetMapping("login")
    public ResponseEntity<String> login(@RequestBody UserLoginDto userLoginDto, HttpSession session){
        session.setAttribute("id",userLoginDto.getId());
        session.setMaxInactiveInterval(10000);
        return ResponseEntity.ok().body(userService.loginUser(userLoginDto));
    }
}
