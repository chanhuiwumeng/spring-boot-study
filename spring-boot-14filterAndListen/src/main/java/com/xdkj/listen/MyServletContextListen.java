package com.xdkj.listen;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * ClassName MyServletContextListen
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-11:25
 */
@WebListener
public class MyServletContextListen  implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("----------监听器开始执行-------------");
        sce.getServletContext().setAttribute("ctx",sce.getServletContext().getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
