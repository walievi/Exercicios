public class ProcessadorDeImagem implements ProcessadorDeMidia {
    @Override
    public void carregar() {
        System.out.println("Carregando imagem...");
    }

    @Override
    public void processar() {
        System.out.println("Processando imagem...");
    }
}