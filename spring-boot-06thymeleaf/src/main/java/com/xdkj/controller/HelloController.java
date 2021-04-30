package com.xdkj.controller;

import com.xdkj.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName HelloController
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-27-10:23
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public Map<String,String> hello(){
        Map<String,String> map = new HashMap<>();

        System.out.println("----------------------");
        map.put("Hello","Hello World SpringBoot");
        return map;
    }

    @GetMapping("/list")
    public String list(Model model){
        Map<String,String> map = new HashMap<>();
        map.put("hello","Hello World SpringBoot");
        map.put("tag","<h3>HelloWorld</h3>");
        map.put("num","8888888");
        model.addAttribute("list",map);
        return "index";
    }
    @GetMapping("/stu")
    public String stu(Model model){
       Student  student = new Student();
        student.setId(12);
        student.setName("admin");
        student.setEmail("123@qq.com");
        model.addAttribute("student",student);
        return "student";
    }
    @GetMapping("/student/{name}/{email}")
    public String student(@PathVariable String name, @PathVariable String email, Model model){
        Student  student = new Student();
        student.setId(12);
        student.setName(name);
        student.setEmail(email);
        model.addAttribute("student",student);
        return "student";
    }

    @GetMapping("/array")
    public String array(Model model){
        Student  student = new Student();
            student.setId(12);
            student.setName("admin");
            student.setEmail("12345@qq.com");
        Student  student1 = new Student();
            student1.setId(13);
            student1.setName("joke");
            student1.setEmail("12345@qq.com");
        Student  student2 = new Student();
            student2.setId(14);
            student2.setName("hanmeiemi");
            student2.setEmail("12345@qq.com");
        Student  student3 = new Student();
            student3.setId(15);
            student3.setName("llucy");
            student3.setEmail("12345@qq.com");
        List<Student> list = new ArrayList<>();
            list.add(student);
            list.add(student1);
            list.add(student2);
            list.add(student3);
            model.addAttribute("list",list);
        return "list";
    }

}
