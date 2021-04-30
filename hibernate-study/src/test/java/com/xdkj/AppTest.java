package com.xdkj;

import com.xdkj.dao.StudentDao;
import com.xdkj.dao.impl.StudentDaoImpl;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    StudentDao  studentDao = new StudentDaoImpl();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        /*List<Student> students = studentDao.selectAll();
        System.out.println(students);*/

        studentDao.selectOne();

    }
}
