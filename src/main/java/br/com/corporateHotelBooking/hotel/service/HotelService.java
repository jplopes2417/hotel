package br.com.corporateHotelBooking.hotel.service;

import br.com.corporateHotelBooking.hotel.enums.RoomType;
import br.com.corporateHotelBooking.hotel.model.Hotel;

public interface HotelService {

    void addHotel(Long hotelId, String hotelName);
    void setRoom(Long hotelId, int number, RoomType roomType);
    Hotel findHotelBy(Long hotelId);

}
