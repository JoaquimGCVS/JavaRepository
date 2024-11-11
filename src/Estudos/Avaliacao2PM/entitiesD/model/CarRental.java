package Estudos.Avaliacao2PM.entitiesD.model;

import java.time.LocalDate;

public class CarRental {  // Aluguel de Carro
    private LocalDate start;
    private LocalDate finish;
    private Invoice invoice;
    private Vehicle vehicle;

    public CarRental(LocalDate start, LocalDate finish, Invoice invoice, Vehicle vehicle) {
        setStart(start);
        setFinish(finish);
        this.invoice = invoice;
        this.vehicle = vehicle;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getFinish() {
        return finish;
    }

    public void setFinish(LocalDate finish) {
        this.finish = finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
