package com.example.emailsend.emailsend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class EmailsendApplication {
	@Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(EmailsendApplication.class, args);
	}
//	@EventListener(ApplicationReadyEvent.class)
//	public void triggerMail() {
//		service.sendSimpleEmail("jayshri.sapkale@verinite.com","" +
//				"This is the body email..","" +
//				"This is email subject..");
//
//	}
@EventListener(ApplicationReadyEvent.class)
public void triggerMail() throws MessagingException {

	service.sendEmailWithAttachment("prafulla.dauwar@verinite.com",
			"This is Email Body with Attachment...",
			"This email has attachment",
			"C:\\Users\\jayshri\\invoice.pdf");

}

}
