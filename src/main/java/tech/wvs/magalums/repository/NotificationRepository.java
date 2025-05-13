package tech.wvs.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.wvs.magalums.domain.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
