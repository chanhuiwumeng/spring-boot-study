package com.xdkj.controller;

import com.xdkj.exception.MyLoginException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName GlobalErroController
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-28-14:20
 */
@ControllerAdvice
public class GlobalErroController {
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Map<String,Object> arithmeticError(ArithmeticException  exception, HttpServletResponse response){
        Map<String,Object>  map = new HashMap<>();
        map.put("code",response.getStatus());
        map.put("message",exception.getMessage());
        return map;

    }
    @ExceptionHandler(MyLoginException.class)
    @ResponseBody
    public Map<String,Object> loginError(MyLoginException  exception){
        Map<String,Object>  map = new HashMap<>();
        map.put("code",2001);
        map.put("message",exception.getMessage());
        return map;

    }
}
