public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        MetodoDePagamento cartao = new PagamentoComCartao();
        MetodoDePagamento paypal = new PagamentoComPayPal();
        MetodoDePagamento transferencia = new PagamentoComTransferencia();

        carrinho.finalizarCompra(cartao, 100.0);
        carrinho.finalizarCompra(paypal, 200.0);
        carrinho.finalizarCompra(transferencia, 300.0);
    }
}