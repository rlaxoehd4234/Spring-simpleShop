package com.shop.simpleshop.controller;

import com.shop.simpleshop.dto.user.*;
import com.shop.simpleshop.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

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


    @ApiOperation(value = "로그인", notes = "정상 작동 시 비밀 번호 리턴")
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

    @ApiOperation(value = "유저 개인 정보 ", notes = "정상 작동시 1 리턴")
    @ApiResponses({
            @ApiResponse(code = 200, message = "유저 개인정보 리턴 완료"),
            @ApiResponse(code = 401, message = "권한이 없는 유저")
    })
    @GetMapping("/findUser")
    public ResponseEntity<UserResponseInfoDto> findUser(HttpSession session){
        return ResponseEntity.ok().body(userService.infoUser(session));
    }
    @ApiOperation(value = "유저 정보 수정", notes = "정상 작동시 1 리턴")
    @ApiResponses({
            @ApiResponse(code = 200, message = "유저 정보 업데이트 완료"),
            @ApiResponse(code = 401, message = "권한이 없는 유저")
    })
    @PatchMapping("/updateInfo")
    public ResponseEntity<Integer> updateUserInfo(@RequestBody UserRequestUpdateDto userRequestUpdateDto, HttpSession session){
        return ResponseEntity.ok().body(userService.updateUserInfo(userRequestUpdateDto, session));
    }
    @ApiOperation(value = "유저 탈퇴 ", notes = "정상 작동시 1 리턴")
    @ApiResponses({
            @ApiResponse(code = 200, message = "유저 탈퇴 완료"),
            @ApiResponse(code = 401, message = "권한이 없는 유저")
    })
    @DeleteMapping("/deleteUser")
    public ResponseEntity<Integer> deleteUser(HttpSession session){
        return ResponseEntity.ok().body(userService.deleteUser(session));
    }
    @ApiOperation(value = "유저 리스트 반환 ", notes = "정상 작동시 리스트 리턴")
    @ApiResponses({
            @ApiResponse(code = 200, message = "유저 리스트 반환 완료"),
            @ApiResponse(code = 401, message = "권한이 없는 유저")
    })
    @GetMapping("/findAllUser")
    public ResponseEntity<List<UserResponseListDto>> findAllUser(){
        return ResponseEntity.ok().body(userService.findAllUser());
    }
}
