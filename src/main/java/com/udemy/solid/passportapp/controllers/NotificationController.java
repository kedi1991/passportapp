package com.udemy.solid.passportapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.solid.passportapp.entity.NotificationRequest;
import com.udemy.solid.passportapp.services.NotificationService;

@RestController
public class NotificationController {
	
	NotificationService notificationService;
	
	public NotificationController(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@GetMapping("/send")
	public NotificationRequest sendMsg(@RequestParam String channel) {
		return notificationService.send(channel);
	}
	
}
