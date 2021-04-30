package com.xdkj.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * ClassName PageService
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-14:09
 */
@Service
public class PageService {
    //开启异步支持
    @Async
    public String hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------async method handler----");
        return "HelloWorld";
    }
}
