package AirbnbClone.AirbnbClone.service;

import AirbnbClone.AirbnbClone.dto.HotelDto;
import AirbnbClone.AirbnbClone.dto.HotelSearchRequest;
import AirbnbClone.AirbnbClone.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {
    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
