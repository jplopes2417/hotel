package br.com.corporateHotelBooking.hotel.model;

import br.com.corporateHotelBooking.hotel.enums.RoomType;
import lombok.*;
import org.springframework.data.util.ProxyUtils;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "room")
public class Room {

    @Id
    @Column(name = "room_id")
    private Long roomId;

    @Column(name = "room_type")
    private RoomType roomType;

    @Column(name = "room_number")
    private int roomNumber;

    @ManyToOne
    @JoinColumn(name = "hotel_id_")
    private Hotel hotelId;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || ProxyUtils.getUserClass(this) != ProxyUtils.getUserClass(o))
//            return false;
//        Room room = (Room) o;
//        return roomId != null && Objects.equals(roomId, room.roomId);
//    }

//    @Override
//    public int hashCode() {
//        return getClass().hashCode();
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return getRoomNumber() == room.getRoomNumber() && Objects.equals(getRoomId(), room.getRoomId()) && getRoomType() == room.getRoomType() && Objects.equals(getHotelId(), room.getHotelId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoomId(), getRoomType(), getRoomNumber(), getHotelId());
    }
}
