package com.xdkj;

import com.xdkj.mail.MySendMail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot18emailApplicationTests {
@Autowired
    MySendMail  mySendMail;
    @Test
    void contextLoads() {
        mySendMail.sendMail(null,null);
    }

    @Test
    void sendHttpMail() {
        mySendMail.sendHttpMail(null,null);
    }

}
