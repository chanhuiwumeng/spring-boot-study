package com.xdkj.controller;

import com.xdkj.beans.Student;
import com.xdkj.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName StudentController
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-27-16:59
 */
@Controller
public class StudentController {
    @Autowired
    StudentDao studentDao;
    @GetMapping("/list")
    public String listStudent(Model model){
        List<Student> all = studentDao.findAll();
        model.addAttribute("list",all);
        return "member-list";
    }
    //自定义查询
    @GetMapping("/findOne")
    @ResponseBody
    public Student findOne(Model model){

        return studentDao.findByIdAndStuname(906,"黑旋风李逵");
    }

    //分页
    @GetMapping("/page")
    @ResponseBody
    public List<Student> page(Model model){
        //设置开启查询的起始值 每页显示的数据数 按照哪一个字段升序降序查询
        PageRequest page = PageRequest.of(0, 10, Sort.by(Sort.Order.desc("id")));
        Page<Student> all = studentDao.findAll(page);
        List<Student> students = all.toList();
        return students;
    }

}
