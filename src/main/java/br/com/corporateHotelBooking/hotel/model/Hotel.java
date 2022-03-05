package br.com.corporateHotelBooking.hotel.model;

import lombok.*;
import org.springframework.data.util.ProxyUtils;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hotel")
public class Hotel {

    @ManyToMany
    @Id
    @ToString.Exclude
    @Column(name = "hotel_id")
    private Long hotelId;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "room")
    private Set<Room> rooms;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || ProxyUtils.getUserClass(this) != ProxyUtils.getUserClass(o))
            return false;
        Hotel hotel = (Hotel) o;
        return hotelId != null && Objects.equals(hotelId, hotel.hotelId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
