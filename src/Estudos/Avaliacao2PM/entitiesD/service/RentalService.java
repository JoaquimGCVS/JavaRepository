package Estudos.Avaliacao2PM.entitiesD.service;

import Estudos.Avaliacao2PM.entitiesD.model.CarRental;
import Estudos.Avaliacao2PM.entitiesD.model.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerDay;
    private double pricePerHour;
    private TaxService taxService;

    public RentalService(double pricePerDay, double pricePerHour, TaxService taxService) {
        setPricePerDay(pricePerDay);
        setPricePerHour(pricePerHour);
        this.taxService = taxService;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes();
        double hours = minutes / 60;
        
        double basicPayment;
        if(hours<=12) {
            basicPayment = Math.ceil(hours) * pricePerHour;
        }
        else {
            basicPayment = Math.ceil(hours/24) * pricePerHour;
        }
        
        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
