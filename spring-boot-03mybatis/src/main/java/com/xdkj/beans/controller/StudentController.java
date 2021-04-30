package com.xdkj.beans.controller;

import com.xdkj.beans.entity.Student;
import com.xdkj.beans.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2021-04-26 15:15:20
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Student selectOne(Integer id) {
        return this.studentService.queryById(id);
    }

}
