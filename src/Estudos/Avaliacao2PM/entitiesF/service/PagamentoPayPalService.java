package Estudos.Avaliacao2PM.entitiesF.service;

public class PagamentoPayPalService implements PagamentoService {

    @Override
    public void pagamento(double valor, int numeroMeses) {
        double valorBaseParcela = valor / numeroMeses;
        for (int mes = 1; mes <= numeroMeses; mes++) {
            double jurosSimples = valorBaseParcela * 0.01 * mes;
            double valorParcelaComJuro = valorBaseParcela + jurosSimples;
            double valorParcelaFinal = valorParcelaComJuro * 1.02;
            System.out.printf("Pagamento do mês %d: %.2f%n", mes, valorParcelaFinal);
        }
    }

}
