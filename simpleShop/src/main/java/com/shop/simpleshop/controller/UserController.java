package com.shop.simpleshop.controller;

import com.shop.simpleshop.dto.user.UserSignUpDto;
import com.shop.simpleshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("/signUp")
    public ResponseEntity<Integer> save(@RequestBody UserSignUpDto userSignUpDto){
        return ResponseEntity.ok().body(userService.signUpUser(userSignUpDto));
    }
}
