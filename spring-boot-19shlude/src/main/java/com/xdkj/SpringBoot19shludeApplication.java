package com.xdkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  //开启定时
public class SpringBoot19shludeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot19shludeApplication.class, args);
    }

}
