package com.shop.simpleshop.exception.domain;

import com.shop.simpleshop.exception.ExceptionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum QnAExceptionType implements ExceptionType {

    ;

    private int errorCode;
    private HttpStatus httpStatus;
    private String errorMessage;


}
