package tech.wvs.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.wvs.magalums.domain.Notification;
import tech.wvs.magalums.domain.Status;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}
