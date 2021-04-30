package com.xdkj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName StudentController
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-10:11
 */
@Controller
//@CrossOrigin
public class StudentController {

    @CrossOrigin(methods = {RequestMethod.GET},origins = "http://localhost:8080")
    @GetMapping("list")
    @ResponseBody
    public List<String> list(){
        return Arrays.asList("Student","Hello","World","Java");
    }
}
