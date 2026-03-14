package AirbnbClone.AirbnbClone.repository;

import AirbnbClone.AirbnbClone.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
