class CalculadoraAvancada implements Calculadora {

    public void adicionar(double a, double b) {
        System.out.println("Adição: " + (a + b));
    }

    public void subtrair(double a, double b) {
        System.out.println("Subtração: " + (a - b));
    }

    public void multiplicar(double a, double b) {
        System.out.println("Multiplicação: " + (a * b));
    }

    public void dividir(double a, double b) {
        if (b != 0) {
            System.out.println("Divisão: " + (a / b));
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
    }

    public void potenciar(double a, double b) {
        System.out.println("Potenciação: " + Math.pow(a, b));
    }

    public void raizQuadrada(double a) {
        System.out.println("Raiz quadrada: " + Math.sqrt(a));
    }

    public void logaritmo(double a) {
        if (a > 0) {
            System.out.println("Logaritmo: " + Math.log(a));
        } else {
            System.out.println("Não é possível calcular logaritmo de número não positivo.");
        }
    }
}