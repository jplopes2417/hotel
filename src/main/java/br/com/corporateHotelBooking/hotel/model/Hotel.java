package br.com.corporateHotelBooking.hotel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    private Long hotelId;
    private String hotelName;
    private Set<Room> rooms;

}
