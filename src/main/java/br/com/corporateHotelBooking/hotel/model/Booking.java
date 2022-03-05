package br.com.corporateHotelBooking.hotel.model;

import br.com.corporateHotelBooking.hotel.enums.RoomType;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "booking")
public class Booking {

    @Id
    @Column(name = "booking_id")
    private Long bookingId;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "hotel_id")
    private Long hotelId;

    @Column(name = "room_type")
    private RoomType roomType;

    @Column(name = "check_in")
    private Date checkIn;

    @Column(name = "check_out")
    private Date checkOut;
}
