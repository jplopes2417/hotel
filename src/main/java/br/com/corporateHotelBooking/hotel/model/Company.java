package br.com.corporateHotelBooking.hotel.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "company")
public class Company {

    @Id
    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "company_name")
    private String companyName;

}
