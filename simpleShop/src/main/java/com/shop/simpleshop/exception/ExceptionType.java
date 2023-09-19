package com.shop.simpleshop.exception;

import org.springframework.http.HttpStatus;

public interface ExceptionType {

    int getErrorCode();
    HttpStatus getHttpStatus();
    String getErrorMessage();

}
