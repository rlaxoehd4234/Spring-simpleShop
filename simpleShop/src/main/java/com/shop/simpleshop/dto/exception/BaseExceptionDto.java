package com.shop.simpleshop.dto.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseExceptionDto {
    private int errorCode;
    private String errorMessage;
}
