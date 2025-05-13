package tech.wvs.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.wvs.magalums.domain.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
