package com.udemy.solid.passportapp.services;

import org.springframework.stereotype.Service;

import com.udemy.solid.passportapp.entity.NotificationChannel;
import com.udemy.solid.passportapp.entity.NotificationRequest;
import com.udemy.solid.passportapp.interfaces.Notifications;

@Service
public class SMSNotificationService  implements Notifications{

	@Override
	public NotificationChannel supports() {
		return NotificationChannel.SMS;
	}

	@Override
	public NotificationRequest send() {
		return new NotificationRequest(NotificationChannel.SMS, "sms@yahoo.com", "Sending message using the Vodafone API");
	}

}
