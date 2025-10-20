package com.udemy.solid.passportapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.udemy.solid.passportapp.entity.NotificationChannel;
import com.udemy.solid.passportapp.entity.NotificationRequest;
import com.udemy.solid.passportapp.interfaces.Notifications;


@Service
public class NotificationService {

	List<Notifications> notifications;

	public NotificationService(List<Notifications> notifications) {
		this.notifications = notifications;
	}
	
	public NotificationRequest send(String channel) {
		for (Notifications notification: notifications) {
			if (notification.supports() == NotificationChannel.valueOf(channel)) {
				return notification.send();
			}
		}
		throw new IllegalArgumentException("Not supported: " + channel);
	}
	
}
