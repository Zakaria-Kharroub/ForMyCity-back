package com.example.city.repository;

import com.example.city.domain.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,String> {
}
