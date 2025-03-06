package atividade6_3;

import java.util.Scanner;

public class Atividade6_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Informe o nome do produto");
        produto.setNome(teclado.nextLine());

        System.out.println("Informe o preço do produto");
        produto.setPreco(teclado.nextDouble());

        System.out.println("Informe a quantidade atual do produto");
        produto.setQuantidade(teclado.nextInt());
        int cont = 5;
        while (cont != 0) {
            

            System.out.println("---MENU---" + "\n1.Adicionar\n2.Remover\n3.Calcular valor total\n4.Exibir dados do produto\n5.Sair");
            int resp = teclado.nextInt();
            switch (resp) {
                case 1:

                    System.out.println("Quantos você deseja adicionar?");
                    produto.adicionar(teclado.nextInt());
                    break;
                case 2:
                    System.out.println("Quantos você deseja remover:?");
                    produto.remover(teclado.nextInt());

                    break;
                case 3:
                    System.out.println("Valor calculado: " + produto.calcularValor());
                    break;
                case 4:
                    produto.exibir();
                    break;
                case 5:
                    System.out.println("Bye!!!");
                    cont = 0;
                    break;
                default:
                    System.out.println("Número informado inválido!");
            }

        }

    }

}
