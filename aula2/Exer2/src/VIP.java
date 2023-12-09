public class VIP extends Ingresso{
    double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double obterValor(){
        return super.getValor() + this.getValorAdicional();
    }
}
