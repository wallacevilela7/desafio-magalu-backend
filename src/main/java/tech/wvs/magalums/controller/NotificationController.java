package tech.wvs.magalums.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.wvs.magalums.controller.dto.ScheduledNotificationDto;
import tech.wvs.magalums.domain.Notification;
import tech.wvs.magalums.service.NotificationService;

@RestController
@RequestMapping(path = "/api/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // Solicitação de Agendamento
    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody ScheduledNotificationDto notificationDto) {

        notificationService.scheduledNotification(notificationDto);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{notificationId}")
    public ResponseEntity<Notification> getNotification(@PathVariable Long notificationId) {
        var notification = notificationService.findById(notificationId);

        return notification.isPresent() ?
                ResponseEntity.ok(notification.get()) :
                ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{notificationId}")
    public ResponseEntity<Void> deleteNotification(@PathVariable Long notificationId) {
        notificationService.cancelNotification(notificationId);

        return ResponseEntity.noContent().build();
    }
}
