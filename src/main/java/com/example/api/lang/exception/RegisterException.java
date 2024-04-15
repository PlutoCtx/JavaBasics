package com.example.api.lang.exception;

/**
 * JavaBasics
 * 注册异常
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/16 0:44
 * @since JDK17
 */

public class RegisterException extends RuntimeException{

    public RegisterException(String message) {
        super(message);
    }

}
