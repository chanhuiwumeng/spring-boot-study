package com.xdkj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName WebmvcConfig
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-30-10:30
 */
@Configuration
public class WebmvcConfig  implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
    }



    @Bean
    public LocaleResolver  localeResolver(){
        return  new MyLocalResolver();
    }
}
