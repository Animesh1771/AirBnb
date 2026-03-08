package AirbnbClone.AirbnbClone.repository;

import AirbnbClone.AirbnbClone.entity.Inventory;
import AirbnbClone.AirbnbClone.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByDateAfterAndRoom(LocalDate date, Room room);
}
