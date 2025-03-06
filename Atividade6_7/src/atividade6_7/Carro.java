package atividade6_7;

/*Método que calcula o consumo total para uma viagem, dado a distância
(passada como parâmetro).
o Desafio extra: Método que estima o custo da viagem com base no preço
do combustível (passado como parâmetro).*/
public class Carro {

    private String modelo;
    private double consumoPorKm;

    public Carro() {
        this.modelo = "Genérico";
        this.consumoPorKm = 10;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }

    public double calcularConsumo(double distancia) {

        return distancia / consumoPorKm;

    }

    public double estimarCusto(double preco, double distancia) {
        double consumoTotal = calcularConsumo(distancia);

        return consumoTotal * preco;

    }

}
