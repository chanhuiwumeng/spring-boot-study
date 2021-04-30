package com.xdkj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ClassName PageController
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-28-14:57
 */
@Controller
public class PageController {

    @PostMapping("/hello")
    public String hello(){
        return "index";
    }
}
