package atividade6_9;

import java.util.Scanner;

public class Atividade6_9 {

    public static void main(String[] args) {
        //metodo para ativar o teclado
        Scanner teclado = new Scanner(System.in);

        Livro livro = new Livro();

        System.out.println("Insira o nome do livro");
        livro.setTitulo(teclado.next());

        System.out.println("Insira o autor");
        livro.setAutor(teclado.next());

        System.out.println("Quantas páginas tem este livro?");
        livro.setTotalPaginas(teclado.nextInt());

        System.out.println("Quantas páginas já foram lidas?");
        livro.setPaginasLidas(teclado.nextInt());

        //um if para verificar se a pessoa não inseriu um número inválido
        if (livro.getPaginasLidas() > livro.getTotalPaginas()) {
            System.out.println("Número de páginas excede o número total de páginas do livro");
        } else if (livro.getPaginasLidas() < 0 || livro.getTotalPaginas() <= 0) {
            System.out.println("Tá devendo?");

        } else {
            System.out.println("Título: " + livro.getTitulo()
                    + "\nAutor: " + livro.getAutor()
                    + "\nPáginas totais: " + livro.getTotalPaginas()
                    + "\nJá foram lidas  " + livro.verificarPorcentagem() + "% de páginas.");
            livro.verificarCompletude();
        }
    }

}
