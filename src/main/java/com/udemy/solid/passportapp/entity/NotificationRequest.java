package com.udemy.solid.passportapp.entity;

public class NotificationRequest {
	
	private NotificationChannel notificationChannel;
	private String recipient;
	private String message;
	
	public NotificationRequest(NotificationChannel notificationChannel, String recipient, String message) {
		super();
		this.notificationChannel = notificationChannel;
		this.recipient = recipient;
		this.message = message;
	}
	public NotificationChannel getNotificationChannel() {
		return notificationChannel;
	}
	public void setNotificationChannel(NotificationChannel notificationChannel) {
		this.notificationChannel = notificationChannel;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
