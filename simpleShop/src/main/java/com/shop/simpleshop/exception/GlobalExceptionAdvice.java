package com.shop.simpleshop.exception;


import com.shop.simpleshop.dto.exception.BaseExceptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<BaseExceptionDto> domainExceptionHandler(BaseException baseException){
        return ResponseEntity.status(baseException.getExceptionType().getHttpStatus())
                .body(new BaseExceptionDto(baseException.getExceptionType().getErrorCode()
                        , baseException.getExceptionType().getErrorMessage()));
    }

}
