package br.com.corporateHotelBooking.hotel.service;

public interface CompanyService {

    void addEmployee(Long companyId, Long employeeId);
    void deleteEmployee(Long employeeId);

}
