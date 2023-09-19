package com.shop.simpleshop.controller;

import com.shop.simpleshop.dto.user.UserLoginDto;
import com.shop.simpleshop.dto.user.UserSignUpDto;
import com.shop.simpleshop.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @ApiOperation(value = "회원 가입" , notes = "정상 작동시 1리턴")
    @ApiResponses({
            @ApiResponse(code = 200 , message = "정상 로그인 완료"),
            @ApiResponse(code = 400, message  = "이미 존재 하는 아이디")
    })
    @PostMapping("/signUp")
    public ResponseEntity<Integer> save(@RequestBody UserSignUpDto userSignUpDto){
        return ResponseEntity.ok().body(userService.signUpUser(userSignUpDto));
    }


    @ApiOperation(value = "회원 가입", notes = "정상 작동 시 비밀 번호 리턴")
    @ApiResponses({
            @ApiResponse(code = 200, message = "로그인 완료"),
            @ApiResponse(code = 400, message = "로그인 실패(비밀 번호 & 아이디 통합)")
    })
    @PostMapping("login")
    public ResponseEntity<String> login(@RequestBody UserLoginDto userLoginDto, HttpSession session){
        session.setAttribute("id",userLoginDto.getId());
        session.setMaxInactiveInterval(100000);
        return ResponseEntity.ok().body(userService.loginUser(userLoginDto));
    }
}
