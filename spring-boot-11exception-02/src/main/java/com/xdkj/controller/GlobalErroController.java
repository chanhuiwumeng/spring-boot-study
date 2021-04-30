package com.xdkj.controller;

import org.springframework.ui.Model;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName GlobalErroController
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-28-14:59
 */
//@ControllerAdvice
@RestControllerAdvice
public class GlobalErroController {
/*
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public String methodNotFound(HttpRequestMethodNotSupportedException exception,
                                 HttpServletRequest request, Model model){
        System.out.println("------------------------------");
            Map<String,Object> map = new HashMap<>();
            map.put("timestamp", LocalTime.now());
            map.put("message",exception.getMessage());
            map.put("path",request.getRequestURI());
            map.put("error",exception.getStackTrace());
            map.put("status",HttpServletResponse.SC_FORBIDDEN);
        model.addAttribute("map",map);
        return "error/4xx";
    }*/


    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Map<String,Object> methodNotFound(HttpRequestMethodNotSupportedException exception,
                                 HttpServletRequest request, Model model){
        System.out.println("------------------------------");
        Map<String,Object> map = new HashMap<>();
        map.put("timestamp", LocalTime.now());
        map.put("message",exception.getMessage());
        map.put("path",request.getRequestURI());
       // map.put("error",exception.getStackTrace());
        map.put("status",HttpServletResponse.SC_FORBIDDEN);

        return map;
    }
}
