package atividade6_1;

import java.util.Scanner;

public class Atividade6_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ManipulacaoString m = new ManipulacaoString();

        System.out.println("Qual palavra você deseja ver?");
        String palavra1 = teclado.nextLine();
        m.contarCaractere(palavra1);

        

        System.out.println("Caracteres: " + palavra1 + "\nInvertida: " + m.inverter(palavra1));
        m.VerificarImparPar(palavra1);

    }

}
