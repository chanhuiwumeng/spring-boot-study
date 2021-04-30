package com.xdkj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName StudentController
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-27-9:56
 */
//@Controller
@RestController
public class StudentController {

    @RequestMapping("list")
    public List<String> list(){
        return Arrays.asList("Hello","World");
    }
}
