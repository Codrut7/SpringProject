package com.cinemaProject.cinemaproject.util;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import com.cinemaProject.cinemaproject.entities.Client;

public class EmailSender {
	
	public static void sendEmail(Client client, String generatedString) {
		String to = client.getEmail();
		final String user = "cinemazonerecover@gmail.com";
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		final String password = "ParolaSigura7";
	    String host = "smtp.gmail.com";
	    //Get the session object  
	    //Get the session object  
	    Properties props = new Properties();  
	    props.put("mail.smtp.host",host);  
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.setProperty("mail.smtp.user", user);
        props.setProperty("mail.smtp.password", password);
        props.setProperty("mail.smtp.auth", "true"); 

	    Session session = Session.getDefaultInstance(props,  
	    	    new javax.mail.Authenticator() {  
	    	      protected PasswordAuthentication getPasswordAuthentication() {  
	    	    return new PasswordAuthentication(user,password);  
	    	      }  
	    	    });  
	    
	      try {
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(user));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("Here is your password !");

	         // Now set the actual message

	         message.setText("Your password is : "+ generatedString);

	         // Send message
	         Transport.send(message); 
	         System.out.println("Sent message successfully....");
	      } catch (MessagingException mex) {
	    	  mex.printStackTrace();
	      }
	   }

}
