/*Método para calcular a média das notas.
o Método para verificar se o aluno foi aprovado (média &gt;= 7.0).
o Método para exibir os dados do aluno, incluindo a média.
 */
package atividade6_6;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void verifarAprovacao() {
        if (calcularMedia() > 7) {
            System.out.println("Aluno aprovado, parabéns!!!");

        } 
        else if(calcularMedia()==7){System.out.println("Aluno aprovado, por pouco, em :)");}
        
        else {
            System.out.println("Aluno está reprovado :(");
        }

    }

    public void exibir() {
        System.out.println("Aluno: " + nome + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + calcularMedia());

    }

}
