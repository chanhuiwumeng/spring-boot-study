package com.xdkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xdkj.dao")
public class SpringBoot12mybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot12mybatisplusApplication.class, args);
    }

}
