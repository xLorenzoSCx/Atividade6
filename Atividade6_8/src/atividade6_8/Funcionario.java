package atividade6_8;

/*Método para reajustar o salário com base em um percentual informado.
o Método para exibir as informações do funcionário.
o Desafio extra: Método que calcula o valor anual recebido após o
reajuste.*/
public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
//metodo para calcular o reajuste dado uma porcentagem
    public double reajustar(double percentual) {
        return salario+=salario * (percentual / 100);
    }
//metodo para calcular o salario anual
    public double calcularAnual() {
        return salario * 12;
    }
//metodo usado para exibir as informações do funcionario
    public void exibir() {
        System.out.println("Funcionário: " + nome
                + "\nSalário base: " + salario
                + "\nSalário anual: " + calcularAnual());

    }

}
