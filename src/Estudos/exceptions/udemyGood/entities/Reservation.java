package Estudos.exceptions.udemyGood.entities;

import Estudos.exceptions.udemyGood.exceptions.DomainException;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation (Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        setRoomNumber(roomNumber);
        validateDates(checkIn,checkOut);
        this.checkIn=checkIn;
        this.checkOut=checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        if (roomNumber==null || roomNumber<=0) {
            throw new DomainException("The room number cannot equals 0, negative or null");
        }
        this.roomNumber=roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    private void validateDates(LocalDate checkIn,LocalDate checkOut) {
        if (!checkIn.isAfter(LocalDate.now())) {
            throw new DomainException("The dates must be future dates");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("The check-in date must be before the check-out date");
        }
    }

    public Long duration() {
        return ChronoUnit.DAYS.between(getCheckIn(),getCheckOut());
        // ChronoUnit.DAYS.between(getCheckin(),getCheckout());
    }

    public void updateDates(LocalDate newCheckIn, LocalDate newCheckOut) {
        validateDates(newCheckIn,newCheckOut);
        this.checkIn=newCheckIn;
        this.checkOut=newCheckOut;
    }

}
