package com.udemy.solid.passportapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.udemy.solid.passportapp.entity.NotificationChannel;
import com.udemy.solid.passportapp.entity.NotificationRequest;
import com.udemy.solid.passportapp.interfaces.Notifications;


@Service
public class EmailNotificationsService implements Notifications{
	
	@Override
	public NotificationChannel supports() {
		return NotificationChannel.EMAIL;
	}

	@Override
	public NotificationRequest send() {
		//send the email message		
		return new NotificationRequest(NotificationChannel.EMAIL, "abcd@gmail.com", "Hello from the Java SMTP Library.");
	}

}
