public class Main {
    public static void main(String[] args) {
        ImovelNovo imovelNovo = new ImovelNovo("Endereço 1", 300000, 50000);
        ImovelVelho imovelVelho = new ImovelVelho("Endereço 2", 200000, 30000);

        System.out.println("Valor Imovel Novo: " + imovelNovo.valorImovel());
        System.out.println("Valor Imovel Velho: " + imovelVelho.valorImovel());
    }
}