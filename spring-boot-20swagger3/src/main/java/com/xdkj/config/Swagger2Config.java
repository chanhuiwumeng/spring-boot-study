package com.xdkj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName Swagger2Config
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-17:01
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    //注入配置信息
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xdkj"))
                .paths(PathSelectors.regex("/.*"))
                .build();
    }
    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("matthew swagger-bootstrap-ui RESTful APIs")
                .description("matthew swagger-bootstrap-ui")
                .version("7.4")
                .build();

    }

}
