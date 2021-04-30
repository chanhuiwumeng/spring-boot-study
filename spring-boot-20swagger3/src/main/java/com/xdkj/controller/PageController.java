package com.xdkj.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName PageController
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-17:07
 */
@Controller
@Api(value = "页面请求处理器",produces = "请求处理")
public class PageController {

    @ApiOperation(nickname = "hello",value = "用户数据查询",httpMethod = "GET")
    @PostMapping("/hello")
    @ResponseBody
    public String hello(
            @ApiParam(value = "name",
                    name = "用户名称",
                    defaultValue = "admin",
                    required = true)
                   @RequestParam("name") String name){
        System.out.println(name);
        return "Hello World";
    }

    @GetMapping("/hehe")
    @ResponseBody
    public String hehe(){
        return "Hello WOrld";
    }
}
