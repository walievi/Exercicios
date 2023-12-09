public class ProcessadorDeVideo implements ProcessadorDeMidia {
    @Override
    public void carregar() {
        System.out.println("Carregando vídeo...");
    }

    @Override
    public void processar() {
        System.out.println("Processando vídeo...");
    }
}