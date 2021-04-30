package com.xdkj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName PageController
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-12:04
 */
@Controller
public class PageController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("Hello","HelloWorld SpringBoot!");
        return "index";
    }
}
