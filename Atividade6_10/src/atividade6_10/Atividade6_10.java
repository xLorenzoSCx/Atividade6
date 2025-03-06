
package atividade6_10;

import java.util.Scanner;

public class Atividade6_10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Temperatura t = new Temperatura();
        
        System.out.println("Informe os graus celsius");
        t.setCelsius(teclado.nextDouble());
        
        t.exibir();
        
        
        
    }
    
}
