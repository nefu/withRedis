package com.cslc.withRedis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * Created by jay on 2018/5/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MailTest {

    @Autowired
    private JavaMailSender javaMailSender;


    public void sendMail(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1101143623@qq.com");
        message.setTo("1048037635@qq.com","","","");
        message.setSubject("主题，简单邮件");
        message.setText("<html><body><img src=\"cid:xiaoming\"></body></html>");
        javaMailSender.send(message);
    }
    @Test
    public void sendFile() throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        helper.setFrom("1101143623@qq.com");
        helper.setTo(new String[]{"1048037635@qq.com","429284840@qq.com","244350837@qq.com","992562606@qq.com"});
        helper.setSubject("这是一封测试邮件");
        helper.setText("<html><body><img src=\"cid:xiaoming\"></body></html>",true);
        FileSystemResource fileSystemResource = new FileSystemResource(new File("xiaoming.jpg"));
        helper.addAttachment("附件1.jpg",fileSystemResource);
        javaMailSender.send(mimeMessage);

    }


}
