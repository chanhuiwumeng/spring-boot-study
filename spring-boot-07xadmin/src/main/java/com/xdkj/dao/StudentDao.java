package com.xdkj.dao;

import com.xdkj.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface StudentDao extends JpaRepository<Student,Integer> {
    //hql语句  from Student
   Student findByIdAndStuname(int id,String stuname);
}
