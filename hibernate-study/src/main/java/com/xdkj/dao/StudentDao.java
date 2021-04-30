package com.xdkj.dao;

import com.xdkj.beans.Student;

import java.util.List;

/**
 * ClassName StudentDao
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-28-17:18
 */
public interface StudentDao {
    List<Student> selectAll();
    Student selectOne();
}
