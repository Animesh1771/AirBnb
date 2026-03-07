package AirbnbClone.AirbnbClone.service;

import AirbnbClone.AirbnbClone.entity.Room;

public interface InventoryService {
    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);
}
