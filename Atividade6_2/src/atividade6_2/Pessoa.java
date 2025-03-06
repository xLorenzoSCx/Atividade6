package atividade6_2;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("A passoa inserida é maior de idade");
        } else if (idade >= 0 && idade < 18) {
            System.out.println("A pessoa inseria é menor de idade");
        } else {
            System.out.println("Número informado inválido");
        }
    }

    public int calcularRestante() {
        return 100 - idade;
    }

}
