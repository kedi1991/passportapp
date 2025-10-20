package com.udemy.solid.passportapp.services;

import org.springframework.stereotype.Service;

import com.udemy.solid.passportapp.entity.NotificationChannel;
import com.udemy.solid.passportapp.entity.NotificationRequest;
import com.udemy.solid.passportapp.interfaces.Notifications;

@Service
public class WANotificationService  implements Notifications{

	@Override
	public NotificationChannel supports() {
		return NotificationChannel.WA;
	}

	@Override
	public NotificationRequest send() {
		return new NotificationRequest(NotificationChannel.WA, "wa@yahoo.com", "Sending message using the WhatsApp API");
	}
}
