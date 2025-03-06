package atividade6_4;

public class Calculadora {

    public double multiplicar(double n1, double n2) {
        return n1 * n1;

    }

    public double calcularRaiz(double numero) {
        return Math.sqrt(numero);

    }

    public double calcularPotencia(int base, int expoente) {
        return Math.pow(base, expoente);
    }

    public int calcularFatorial(int numero) {
        if (numero < 0) {
            System.out.println("Número inserido não pode ser negativo");
            return -1;
        }

        int resultado = 1;
        for (int i = 0; i <= numero; i++) {
            resultado *= i;

        }
        return resultado;
    }

}
