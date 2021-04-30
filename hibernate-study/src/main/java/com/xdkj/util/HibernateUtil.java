package com.xdkj.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * ClassName HibernateUtil
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-28-17:13
 */
public class HibernateUtil {
    private static SessionFactory  sessionFactory=null;
    static{
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }
    public static Session  getSession(){
        //return sessionFactory.openSession();
        //单例的
        return sessionFactory.getCurrentSession();
    }
}
