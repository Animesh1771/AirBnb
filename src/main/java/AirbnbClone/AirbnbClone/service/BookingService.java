package AirbnbClone.AirbnbClone.service;

import AirbnbClone.AirbnbClone.dto.BookingDto;
import AirbnbClone.AirbnbClone.dto.BookingRequest;
import AirbnbClone.AirbnbClone.dto.GuestDto;

import java.util.List;

public interface BookingService {
    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
