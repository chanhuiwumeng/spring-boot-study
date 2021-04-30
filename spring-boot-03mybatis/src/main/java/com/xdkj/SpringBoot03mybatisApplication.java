package com.xdkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xdkj.beans.dao")
public class SpringBoot03mybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot03mybatisApplication.class, args);
    }

}
