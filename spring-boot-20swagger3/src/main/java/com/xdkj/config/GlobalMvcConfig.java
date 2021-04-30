package com.xdkj.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName GlobalMvcConfig
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-17:14
 */
@EnableWebMvc
public class GlobalMvcConfig implements WebMvcConfigurer {
    //静态资源放行
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
      registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
