package br.com.corporateHotelBooking.hotel.exception;

public class NonExistentHotelException extends RuntimeException{

    public NonExistentHotelException(String message, Throwable cause) {
        super(message, cause);
    }
}
