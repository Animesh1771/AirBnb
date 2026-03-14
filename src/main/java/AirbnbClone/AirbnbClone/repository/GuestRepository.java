package AirbnbClone.AirbnbClone.repository;

import AirbnbClone.AirbnbClone.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
