package com.xdkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//开启异步支持
@EnableAsync
public class SpringBoot17asyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot17asyncApplication.class, args);
    }

}
