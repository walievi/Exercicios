public class CarrinhoDeCompras {
    public void finalizarCompra(MetodoDePagamento metodo, double valorTotal) {
        metodo.realizarPagamento(valorTotal);
    }
}