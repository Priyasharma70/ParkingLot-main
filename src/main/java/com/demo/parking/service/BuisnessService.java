package com.demo.parking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class BuisnessService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail() throws MessagingException {


        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setSubject("Here's your e-book");

        helper.setText("<b>Dear friend</b>,<br><i>Please find the book attached.</i>", true);

        FileSystemResource file = new FileSystemResource(new File("C:\\Users\\LENOVO\\Documents\\test.pdf"));
        helper.addAttachment("test.pdf", file);



        helper.setSubject("Here's your pic");
        helper.setTo("aseemsharma0307@gmail.com");

        String content = "<b>Dear gauru</b>,<br><i>Please look at this nice picture:.</i>"
                + "<br><img src='cid:image001'/><br><b>Best Regards</b>";
        helper.setText(content, true);

        FileSystemResource resource = new FileSystemResource(new File("E:\\adobe xd\\app\\pexels-pixabay-220453.jpg"));
        helper.addInline("image001", resource);

        mailSender.send(message);


    }

}
