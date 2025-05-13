package tech.wvs.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.wvs.magalums.domain.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
    // Custom query methods can be defined here if needed
}
