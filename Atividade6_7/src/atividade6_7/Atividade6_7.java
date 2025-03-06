package atividade6_7;

import java.util.Scanner;

public class Atividade6_7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Insira o modelo do carro");
        carro.setModelo(teclado.nextLine());

        System.out.println("Insira a distancia que quer percorrer");
        double distancia = teclado.nextDouble();

        System.out.println("Informe o consumo por quilometro do carro");
        double consumo = teclado.nextDouble();
        carro.setConsumoPorKm(consumo);

        System.out.println("Informe o preço do combustível");
        double preco = teclado.nextDouble();

        System.out.println("O carro de modelo " + carro.getModelo()
                + "\nConsumo total: " + carro.calcularConsumo(distancia)
                + "\nPreço total: " + carro.estimarCusto(preco, distancia)
                + "\nConsumo por quilômetro: " + consumo);

    }

}
