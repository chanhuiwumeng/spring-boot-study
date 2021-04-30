package com.xdkj.controller;

import com.xdkj.exception.MyLoginException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName PageController
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-28-14:18
 */
@Controller
public class PageController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println(1/0);
        return "index";
    }

    @GetMapping("/login")
    public String login(String name){
            if(name.isEmpty() || name == null){
                throw new MyLoginException("登录失败!");
            }else{
                System.out.println("-----login----------");
            }
        return "index";
    }
}
