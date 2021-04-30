package com.xdkj.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * ClassName MySendMail
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-29-14:31
 */
@Service
public class MySendMail {
    @Autowired
    MailSender  mailSender;
    @Autowired
    JavaMailSenderImpl javaMailSender;
    /**
     * 简单邮件发送
     * */
    public  void sendMail(String to,String from){
        //创建邮件发送对象
        SimpleMailMessage  simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setText("你好啊，帅哥!");
            //发送者
            simpleMailMessage.setFrom("523489273@qq.com");
            //收件者
            simpleMailMessage.setTo("523489273@qq.com");
            mailSender.send(simpleMailMessage);
    }
    /**
     * 复杂邮件发送
     * */
    public  void sendHttpMail(String to,String from){
        //创建邮件发送对象
        MimeMessage message = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setTo("2399536296@qq.com");
            helper.setFrom("523489273@qq.com");
            helper.setSubject("-------------------------");
            helper.setText("Hello 小帅哥!");
            helper.setText("<h3>Hello Boy!</h3> <p>2019年4月8日 使用SpringBoot集成邮件模块。在自己的博客新加了评论功能,为了能让自己及时的看到别人在我的个人博客留言信息,我在项目中使用了邮件模块,只要别人在我的博客进行了留言</p>");
            File file = new File("E:\\MacBuntu-Wallpapers\\20180412031959734.jpg");
            helper.addAttachment("1.jpg",file);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        javaMailSender.send(message);
    }
}
