package com.xdkj.config;

import com.xdkj.interceptors.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName MyWebMvcConfif
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-12:06
 */
@Configuration
public class MyWebMvcConfig  implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/");

    }

    @Bean
    public MyInterceptor myInterceptor(){
        return  new MyInterceptor();
    }
}
