package Estudos.avaliacao2PM.entitiesF.model;

import java.time.LocalDate;

public class Contrato {
    private int numeroContrato;
    private LocalDate dataContrato;
    private double valorTotal;

    public Contrato(int numeroContrato, LocalDate dataContrato, double valorTotal) {
        setNumeroContrato(numeroContrato);
        setDataContrato(dataContrato);
        setValorTotal(valorTotal);
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
