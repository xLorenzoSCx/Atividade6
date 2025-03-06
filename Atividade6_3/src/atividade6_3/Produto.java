package atividade6_3;

public class Produto {

    private String nome;
    private int quantidade;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int adicionar(int quantidade) {
        this.quantidade += quantidade;
        return this.quantidade;

    }

    public int remover(int quantidade) {
       
        if (quantidade>this.quantidade) {
            System.out.println("Não é possível remover");
            return -1;
        } else {
            this.quantidade -= quantidade;
        }
        return this.quantidade;

    }

    public double calcularValor() {
        return quantidade * preco;
    }

    public void exibir() {

        System.out.println("Nome: " + this.nome + "\nQuantidade: " + this.quantidade + "\nPreço: " + this.preco);
    }

}
