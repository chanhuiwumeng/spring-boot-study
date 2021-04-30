package com.xdkj.controller;

import com.xdkj.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName TaskController
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-16:12
 */
@Controller
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("task")
    @ResponseBody
    public String task(){
        taskService.senEmail();
        return "Hello Task";
    }
}
