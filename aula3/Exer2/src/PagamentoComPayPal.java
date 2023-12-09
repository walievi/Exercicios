public class PagamentoComPayPal implements MetodoDePagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com PayPal no valor de: " + valor);
    }
}