package tech.wvs.magalums.service;

import org.springframework.stereotype.Service;
import tech.wvs.magalums.controller.dto.ScheduledNotificationDto;
import tech.wvs.magalums.domain.Notification;
import tech.wvs.magalums.repository.NotificationRepository;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduledNotification(ScheduledNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }
}
