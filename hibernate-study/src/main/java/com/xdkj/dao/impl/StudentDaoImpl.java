package com.xdkj.dao.impl;

import com.xdkj.beans.Student;
import com.xdkj.dao.StudentDao;
import com.xdkj.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * ClassName StudentDaoImpl
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-28-17:19
 */
public class StudentDaoImpl implements StudentDao {
    private Session session = HibernateUtil.getSession();
    @Override
    public List<Student> selectAll() {
        Transaction transaction = session.getTransaction();
        transaction.begin();
        List list = session.createQuery(" from Student").list();
        transaction.commit();
        return list;
    }

    @Override
    public Student selectOne() {
        Transaction transaction = session.getTransaction();
        transaction.begin();
      /* Student student = (Student)session.createQuery(" from Student where id=:id").
                setParameter("id",906).
                uniqueResult();*/
        Object o = session.load( Student.class,906);
        System.out.println(o);
        //session 快照
        Object o1 = session.load( Student.class,906);
        System.out.println(o1);
        transaction.commit();


        return null;
    }
}
