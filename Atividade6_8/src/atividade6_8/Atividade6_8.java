package atividade6_8;

import java.util.Scanner;

public class Atividade6_8 {

    public static void main(String[] args) {
        //metodo para ativar o teclado
        Scanner teclado = new Scanner(System.in);
        //classe criada para instanciar o objeto
        Funcionario f = new Funcionario();

        System.out.println("Informe seu nome");
        f.setNome(teclado.nextLine());

        System.out.println("Informe seu salário");
        f.setSalario(teclado.nextDouble());

        System.out.println("Informe a porcentagem do reajuste");
        f.reajustar(teclado.nextInt());

        
        f.exibir();
    }
    
    

}
