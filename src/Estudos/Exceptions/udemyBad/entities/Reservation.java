package Estudos.Exceptions.udemyBad.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        setRoomNumber(roomNumber);
        setCheckin(checkin);
        setCheckout(checkout);
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long duration() {
        long difference = getCheckin().getTime() - getCheckout().getTime(); // diferenca das datas em milisegundos
        return TimeUnit.DAYS.convert(difference,TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date newCheckin,Date newCheckout) {
        this.checkin=newCheckin;
        this.checkout=newCheckout;
    }

    @Override
    public String toString() {
        return "Checkin: " + getCheckin() + " " +
                "Checkout: " + getCheckout() + " " +
                "Room Number: " + getRoomNumber();
    }
}
