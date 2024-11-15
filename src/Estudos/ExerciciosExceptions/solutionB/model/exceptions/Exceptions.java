package Estudos.ExerciciosExceptions.solutionB.model.exceptions;

import Estudos.ExerciciosExceptions.solutionB.model.entities.Reservation;

import java.time.LocalDate;

public class Exceptions {
    public void updateDatesExceptions(Reservation reservation, LocalDate newCheckin, LocalDate newCheckout) {
        try {
            reservation.setCheckin(newCheckin);
            reservation.setCheckout(newCheckout);
        } catch (newCheckin.isBefore(reservation.getCheckin()) || newCheckout.isBefore(reservation.getCheckout())) {
            System.out.println("Alterações de reserva só podem ocorrer para datas futuras");
        } catch (newCheckin.isAfter(newCheckout)) {
            System.out.println("A data de saída deve ser maior que a data de entrada");
        }
    }
}
