package com.amenity_reservation_system.exception;

public class FullCapacityException extends RuntimeException {
    public FullCapacityException(String message) {
        super(message);
    }
}
