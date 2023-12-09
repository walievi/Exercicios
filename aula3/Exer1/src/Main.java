public class Main {
    public static void main(String[] args) {
        ProcessadorDeMidia imagem = new ProcessadorDeImagem();
        ProcessadorDeMidia video = new ProcessadorDeVideo();
        ProcessadorDeMidia audio = new ProcessadorDeAudio();

        imagem.carregar();
        imagem.processar();

        video.carregar();
        video.processar();

        audio.carregar();
        audio.processar();
    }
}