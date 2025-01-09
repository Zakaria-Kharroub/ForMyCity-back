package com.example.city.service;

import com.example.city.domain.Notification;

import java.util.List;

public interface NotificationService {
    Notification save(Notification notification);

    List<Notification> findAll();
}
