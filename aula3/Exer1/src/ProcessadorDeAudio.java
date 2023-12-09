public class ProcessadorDeAudio implements ProcessadorDeMidia {
    @Override
    public void carregar() {
        System.out.println("Carregando áudio...");
    }

    @Override
    public void processar() {
        System.out.println("Processando áudio...");
    }
}