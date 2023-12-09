public class Main {
    public static void main(String[] args) {
        SistemaDeLogin sistemaDeLogin = new SistemaDeLogin();

        Autenticador loginSenha = new LoginComSenha();
        Autenticador biometria = new AutenticacaoBiometrica();
        Autenticador doisFatores = new AutenticacaoDoisFatores();

        sistemaDeLogin.realizarLogin(loginSenha);
        sistemaDeLogin.realizarLogin(biometria);
        sistemaDeLogin.realizarLogin(doisFatores);
    }
}