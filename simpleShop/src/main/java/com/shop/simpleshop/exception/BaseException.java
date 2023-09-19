package com.shop.simpleshop.exception;

public abstract class BaseException extends RuntimeException{
    public abstract ExceptionType getExceptionType();
}
