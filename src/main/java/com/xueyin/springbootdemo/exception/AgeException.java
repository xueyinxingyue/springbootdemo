package com.xueyin.springbootdemo.exception;

public class AgeException extends RuntimeException{
    public AgeException(String message){
        super(message);
    }
}
