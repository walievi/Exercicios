public class PagamentoComTransferencia implements MetodoDePagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com transferência bancária no valor de: " + valor);
    }
}