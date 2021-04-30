package com.xdkj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName GlobalWebmvcConfig
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-27-9:48
 */
@Configuration
public class GlobalWebmvcConfig  implements WebMvcConfigurer {
    //重写静态资源处理放行静态资源
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/public/**","/static/**")
                .addResourceLocations("classpath:/public/","classpath:/static/");
    }
/*视图和控制器映射*/
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }
}
