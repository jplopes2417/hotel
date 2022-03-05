package br.com.corporateHotelBooking.hotel.service;

import br.com.corporateHotelBooking.hotel.model.Booking;
import br.com.corporateHotelBooking.hotel.model.Room;

import java.util.Date;

public interface BookingService {

    Booking book(Long employeeId, Long hotelId, Room roomType, Date checkIn, Date checkOut);

}
