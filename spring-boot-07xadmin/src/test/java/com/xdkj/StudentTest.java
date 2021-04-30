package com.xdkj;

import com.xdkj.beans.Student;
import com.xdkj.dao.StudentDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * ClassName StudentTest
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-27-16:49
 */
@SpringBootTest
public class StudentTest {
    @Autowired
    StudentDao  studentDao;

    @Test
    public  void selectAll(){
        List<Student> all = studentDao.findAll();
        System.out.println(all);

    }
}
