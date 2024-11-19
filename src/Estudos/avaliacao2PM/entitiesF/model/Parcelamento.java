package Estudos.avaliacao2PM.entitiesF.model;

import Estudos.avaliacao2PM.entitiesF.service.PagamentoService;

public class Parcelamento {
    private int numeroParcelamento;
    Contrato contrato;

    public Parcelamento(int numeroParcelamento, Contrato contrato) {
        this.numeroParcelamento = numeroParcelamento;
        this.contrato=contrato;
    }

    public int getNumeroParcelamento() {
        return numeroParcelamento;
    }

    public void setNumeroParcelamento(int numeroParcelamento) {
        this.numeroParcelamento = numeroParcelamento;
    }

    public void processarParcelamento(PagamentoService pagamentoService) {
        pagamentoService.pagamento(contrato.getValorTotal(), numeroParcelamento);
    }

}
