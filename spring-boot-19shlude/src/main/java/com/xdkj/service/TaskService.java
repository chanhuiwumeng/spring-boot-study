package com.xdkj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * ClassName TaskService
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-15:57
 */
@Service
public class TaskService {
    @Autowired
    MailSender mailSender;
    //使用定时
    @Scheduled(cron = "0 28/1 * * * ?  ")
    public void senEmail(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage() ;
        simpleMailMessage.setTo("523489273@qq.com");
        simpleMailMessage.setFrom("523489273@qq.com");
        simpleMailMessage.setSubject("与狼共舞");
        simpleMailMessage.setText("Hello Boy!");
        mailSender.send(simpleMailMessage);
    }
}
