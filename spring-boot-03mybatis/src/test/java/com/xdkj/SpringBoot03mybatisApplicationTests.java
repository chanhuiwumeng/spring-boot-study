package com.xdkj;

import com.xdkj.beans.service.StudentService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.xdkj.beans.dao")
class SpringBoot03mybatisApplicationTests {
    @Autowired
    StudentService  studentService;

    @Test
    void contextLoads() {
        System.out.println(studentService.queryById(906));
    }

}
