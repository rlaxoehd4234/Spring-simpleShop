package com.shop.simpleshop.exception.domain;

import com.shop.simpleshop.exception.ExceptionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum UserExceptionType implements ExceptionType {
    UN_AUTHORIZE_ERROR(400, HttpStatus.OK , "권한이 없는 사용자 입니다."),
    ;
    private int errorCode;
    private HttpStatus httpStatus;
    private String errorMessage;

}
