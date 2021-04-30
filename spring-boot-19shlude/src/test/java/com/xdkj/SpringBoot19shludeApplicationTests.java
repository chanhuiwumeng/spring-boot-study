package com.xdkj;

import com.xdkj.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.TimeZone;

@SpringBootTest

class SpringBoot19shludeApplicationTests {
@Autowired
    TaskService  taskService;
    @Test
    void contextLoads() {
        String[] tz= TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(tz));
        //taskService.senEmail();
    }

}
