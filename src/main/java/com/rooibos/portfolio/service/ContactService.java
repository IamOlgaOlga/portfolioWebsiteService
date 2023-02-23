package com.rooibos.portfolio.service;

import com.rooibos.portfolio.service.exception.PortfolioWebsiteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;
    @Value("${portfolio.website.contact.recipient}")
    private String recipient;

    @Autowired
    public ContactService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void processContactMessage(String userName, String userEmail, String userMessage) throws PortfolioWebsiteException {
// Try block to check for exceptions
        try {

            // Creating a simple mail message
            SimpleMailMessage mailMessage
                    = new SimpleMailMessage();

            // Setting up necessary details
            mailMessage.setFrom(sender);
            mailMessage.setTo(recipient);
            mailMessage.setText(userMessage);
            mailMessage.setSubject("name: " + userName + "; email: " + userEmail);

            // Sending the mail
            javaMailSender.send(mailMessage);
        }
        // Catch block to handle the exceptions
        catch (MailException e) {
            throw new PortfolioWebsiteException(e.getMessage());
        }
    }

}
