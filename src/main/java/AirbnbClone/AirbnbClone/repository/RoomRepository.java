package AirbnbClone.AirbnbClone.repository;

import AirbnbClone.AirbnbClone.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
