public class ImovelNovo extends Imovel {
    private double precoAdicional;

    public ImovelNovo(String endereco, double preco, double precoAdicional) {
        super(endereco, preco);
        this.precoAdicional = precoAdicional;
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public double valorImovel() {
        return getPreco() + precoAdicional;
    }
}