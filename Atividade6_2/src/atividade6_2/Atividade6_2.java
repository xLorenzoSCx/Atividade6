package atividade6_2;

import java.util.Scanner;

public class Atividade6_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Insira seu nome");
        pessoa.setNome(teclado.nextLine());
        
        System.out.println("Insira sua idade");
        pessoa.setIdade(teclado.nextInt());
        
        System.out.println("Insira sua altura");
        pessoa.setAltura(teclado.nextDouble());
        
        
        pessoa.exibir();
        pessoa.verificarIdade();
        System.out.println("Faltam " + pessoa.calcularRestante() + " anos para completar 100 anos");
    }

}
