package Estudos.Avaliacao2PM.entitiesF.application;

import Estudos.Avaliacao2PM.entitiesF.model.Contrato;
import Estudos.Avaliacao2PM.entitiesF.model.Parcelamento;
import Estudos.Avaliacao2PM.entitiesF.service.PagamentoPayPalService;
import Estudos.Avaliacao2PM.entitiesF.service.PagamentoService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Cria um contrato com informações básicas
        Contrato contrato = new Contrato(123, LocalDate.now(), 600.00);

        // Define o parcelamento
        Parcelamento parcelamento = new Parcelamento(3, contrato);

        // Processa o pagamento usando o serviço de pagamento PayPal
        PagamentoService pagamentoService = new PagamentoPayPalService();
        parcelamento.processarParcelamento(pagamentoService);
    }
}
