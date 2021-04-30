package com.xdkj;

import com.xdkj.beans.FtpDemo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot02yamlApplicationTests {
@Autowired
    FtpDemo ftpDemo;
    @Test
    void contextLoads() {
        System.out.println(ftpDemo);
    }

}
