package com.xdkj.controller;

import com.xdkj.dao.StudentDao;
import com.xdkj.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2021-04-28 16:30:02
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentDao studentDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Student selectOne(Integer id) {
        return studentDao.selectById(906);
    }

}
