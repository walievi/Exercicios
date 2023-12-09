public class PagamentoComCartao implements MetodoDePagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com cartão de crédito no valor de: " + valor);
    }
}