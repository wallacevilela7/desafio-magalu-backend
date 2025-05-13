package tech.wvs.magalums.controller.dto;

import jdk.jshell.Snippet;
import tech.wvs.magalums.domain.Channel;
import tech.wvs.magalums.domain.Notification;
import tech.wvs.magalums.domain.Status;

import java.time.LocalDateTime;

public record ScheduledNotificationDto(
        LocalDateTime dateTime,
        String destination,
        String message,
        Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus());
    }
}
