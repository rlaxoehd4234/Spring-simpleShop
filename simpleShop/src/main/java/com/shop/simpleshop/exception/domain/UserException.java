package com.shop.simpleshop.exception.domain;

import com.shop.simpleshop.exception.BaseException;
import com.shop.simpleshop.exception.ExceptionType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserException extends BaseException {
    private ExceptionType exceptionType;
}
