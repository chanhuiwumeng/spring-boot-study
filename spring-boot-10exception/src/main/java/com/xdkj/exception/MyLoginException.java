package com.xdkj.exception;

/**
 * ClassName MyLoginException
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-28-14:27
 */
public class MyLoginException  extends RuntimeException{
    public MyLoginException() {
    }

    public MyLoginException(String message) {
        super(message);
    }
}
