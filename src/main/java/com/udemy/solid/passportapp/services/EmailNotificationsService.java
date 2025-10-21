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
	public NotificationRequest send(String recipient, String message) {
		//send the email message		
		return new NotificationRequest(NotificationChannel.EMAIL, recipient, message);
	}

}
