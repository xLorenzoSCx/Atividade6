package atividade6_4;

import java.util.Scanner;

public class Atividade6_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Insira o valor que deseja multiplicar");
        int multiplo = teclado.nextInt();
        System.out.println("Por qual número você deseja multiplicar");
        int multiplo1 = teclado.nextInt();

        System.out.println("Insira o valor base da pontencia");
        int base = teclado.nextInt();
        System.out.println("Insira o expoente");
        int expoente = teclado.nextInt();

        System.out.println("Insira o valor que deseja calcular a raiz");
        int raiz = teclado.nextInt();
        calculadora.calcularRaiz(raiz);

        System.out.println("Insira o número que deseja calcular o fatorial");

        int resp = teclado.nextInt();

        System.out.println("Cálculo da multiplicação: " + calculadora.multiplicar(multiplo, multiplo1)
                + "\nCálculo da potencia: " + calculadora.calcularPotencia(base, expoente)
                + "\nCálculo da raiz: " + calculadora.calcularPotencia(base, expoente));
        System.out.println("Seu fatorial é " + calculadora.calcularFatorial(resp));

    }

}
