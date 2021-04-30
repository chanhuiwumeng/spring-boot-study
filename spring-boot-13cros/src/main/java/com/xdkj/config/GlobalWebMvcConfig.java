package com.xdkj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName GlobalWebMvcConfig
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-10:20
 */
@Configuration
public class GlobalWebMvcConfig  implements WebMvcConfigurer {
   /*
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("GET","POST","PUT","DELETE","OPTION")
                .allowCredentials(true)
                 .maxAge(3600L);
    }*/
}
