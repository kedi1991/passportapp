package com.udemy.solid.passportapp.interfaces;

import com.udemy.solid.passportapp.entity.NotificationChannel;
import com.udemy.solid.passportapp.entity.NotificationRequest;

public interface Notifications {

	NotificationChannel supports();
	NotificationRequest send(String recipient, String message);
	
}
