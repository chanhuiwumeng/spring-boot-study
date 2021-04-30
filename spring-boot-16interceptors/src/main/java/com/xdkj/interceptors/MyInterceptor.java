package com.xdkj.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName MyInteceptor
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-12:00
 */
public class MyInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("处理准备开始了！！！！");
        return  true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {
        System.out.println("处理完成了，接受到了ModelAndVie");
        System.out.println(modelAndView);
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.println("{\"code\": 2000,\"message\": \"page not found\"}");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("页面处理完成le！！！！1");
    }
}
