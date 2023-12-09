public class AutenticacaoDoisFatores implements Autenticador {
    @Override
    public void autenticar() {
        System.out.println("Autenticando com dois fatores");
    }
}
