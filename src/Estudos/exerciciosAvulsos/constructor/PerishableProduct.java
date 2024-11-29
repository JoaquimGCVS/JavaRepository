package Estudos.exerciciosAvulsos.constructor;

import java.time.LocalDate;

public class PerishableProduct extends Product {
    private LocalDate expirationDate;

    public PerishableProduct(String name, double price, int quantity, LocalDate expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Expiration Date: " + expirationDate;

    }
}
