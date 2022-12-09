package com.example.MailService.service;

import com.example.MailService.entity.EmailDetails;

public interface EmailService {
	String sendSimpleMail(EmailDetails details);
	 
    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}
