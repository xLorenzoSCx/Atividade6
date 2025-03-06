package atividade6_5;

import java.util.Scanner;

public class Atividade6_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();

        System.out.println("Insira seu saldo");
        cb.setSaldo(teclado.nextDouble());

        int cont = 5;
        while (cont != 0) {
            System.out.println("----MENU----" + "\n1.Depositar\n2.Sacar\n3.Exibir extrato\n4.Sair");
            int resp = teclado.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Quanto deseja depositar?");
                    double deposito = teclado.nextDouble();
                    cb.depositar(deposito);
                    System.out.println("Saldo depositado: " + deposito + "\nSaldo atual: " + (cb.getSaldo()+deposito));

            }

        }

    }

}
