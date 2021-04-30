package com.xdkj.controller;

import com.xdkj.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName PageController
 * Description:3
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-14:09
 */
@Controller
public class PageController {
    @Autowired
    PageService pageService;

    @GetMapping("page")
    @ResponseBody
    public String page(){
        System.out.println(pageService.hello());
        System.out.println("page handler");
        return "page handler";
    }
}
