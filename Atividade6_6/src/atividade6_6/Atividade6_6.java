package atividade6_6;

import java.util.Scanner;

public class Atividade6_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Informe seu nome");
        aluno.setNome(teclado.nextLine());
        
        System.out.println("Insira a primeira nota");
        aluno.setNota1(teclado.nextDouble());
        
        System.out.println("Insira a segunda nota");
        aluno.setNota2(teclado.nextDouble());
        
       
       aluno.exibir();
       aluno.verifarAprovacao();
        
    }

}
