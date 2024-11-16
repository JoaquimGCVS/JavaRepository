package Estudos.ExerciciosExceptions.solutionB.model.service;

import Estudos.ExerciciosExceptions.solutionB.model.entities.Reservation;
import Estudos.ExerciciosExceptions.solutionB.model.exceptions.DomainsException;

import java.time.LocalDate;

public class ReservationService {
    public void updateDatesExceptions(Reservation reservation, LocalDate newCheckin, LocalDate newCheckout) {
        if (newCheckin.isBefore(reservation.getCheckin()) || newCheckout.isBefore(reservation.getCheckout())) {
            throw new DomainsException("Alterações de reserva só podem ocorrer para datas futuras");
        } else if (newCheckin.isAfter(newCheckout)) {
            throw new DomainsException("A data de saída deve ser maior que a data de entrada");
        }
        else {
            reservation.setCheckin(newCheckin);
            reservation.setCheckout(newCheckout);
        }
    }
}
