package br.com.corporateHotelBooking.hotel.service;

import br.com.corporateHotelBooking.hotel.enums.RoomType;

import java.util.Set;

public interface BookingPolicyService {

    void setCompanyPolicy(Long companyId, Set<RoomType> roomTypes);
    void setEmployeePolicy(Long employeeId, Set<RoomType> roomTypes);
    boolean isBookingAllowed(Long employeeId, RoomType roomType);
}
