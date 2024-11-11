package Estudos.Avaliacao2PM.entitiesD.model;

public class Invoice { // Fatura
    private double basicPayment;
    private double tax;

    public Invoice(double basicPayment, double tax) {
        setBasicPayment(basicPayment);
        setTax(tax);
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalPayment() {
        return getBasicPayment() + getTax();
        // SOLID, garante que se a regra de negocio for alterada futuramente,
        // nao tenha necessidade de mudar esta implementacao
    }
}
