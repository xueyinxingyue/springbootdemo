package com.xueyin.springbootdemo.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
*   全局异常处理器
*/
@RestControllerAdvice
public class ExceptionHandlerAdvice {

    //处理RuntimeException
    @ExceptionHandler(RuntimeException.class)
    public String handler(RuntimeException e){
        String message = e.getMessage();
        return message;
    }

    //处理Exception
    @ExceptionHandler(Exception.class)
    public String handler(Exception e){
        String message = e.getMessage();
        return message;
    }
}
