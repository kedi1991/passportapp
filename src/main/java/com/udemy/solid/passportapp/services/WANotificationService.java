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
	public NotificationRequest send(String recipient, String message) {
		return new NotificationRequest(NotificationChannel.WA, recipient, message);
	}
}
