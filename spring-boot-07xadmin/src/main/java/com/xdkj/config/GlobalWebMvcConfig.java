package com.xdkj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName GlobalWebMvcConfig
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-27-16:25
 */
@Configuration
public class GlobalWebMvcConfig  implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**","/public/**")
                .addResourceLocations("classpath:/static/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/welcome.html").setViewName("welcome");
        registry.addViewController("/index.html").setViewName("index");
    }
}
