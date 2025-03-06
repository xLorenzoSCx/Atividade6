/*Método para depositar um valor.
o Método para sacar um valor (verificando se há saldo suficiente).
o Método para exibir o saldo atual.
o Desafio extra: Método que calcula o rendimento com base em uma taxa
de juros fixa aplicada ao saldo.
 */
package atividade6_5;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valorDepositado) {
        return saldo + valorDepositado;

    }

    public double sacar(double valorSacado) {
        if (valorSacado > saldo) {
            System.out.println("Impossível sacar este valor");
            return -1;
        } else {
            return saldo - valorSacado;
        }
    }

    public void exibir() {
        System.out.println("Seu saldo é de " + saldo);
    }

    public double calcularRendimento() {

        return saldo * 0.1325;

    }

}
