package com.xdkj.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName GlobalFilter
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-11:18
 */
@WebFilter(urlPatterns = "/*")
public class GlobalFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse  response = (HttpServletResponse)servletResponse;
        System.out.println("-------------------filter开始执行了-------------");
        filterChain.doFilter(request,response);
    }
}
