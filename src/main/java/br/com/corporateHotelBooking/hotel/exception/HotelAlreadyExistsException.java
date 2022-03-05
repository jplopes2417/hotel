package br.com.corporateHotelBooking.hotel.exception;

public class HotelAlreadyExistsException extends RuntimeException{

    public HotelAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
