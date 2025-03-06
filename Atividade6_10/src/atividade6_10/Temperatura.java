package atividade6_10;

/*Método para converter de Celsius para Fahrenheit.
o Método para converter de Celsius para Kelvin.
o Desafio extra: Método que formata a saída mostrando as três
temperaturas de forma organizada.*/
public class Temperatura {

    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double converterFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double converterKelvin() {
        return celsius + 273.15;
    }

    public void exibir() {
        System.out.println("Celsius: " + celsius
                + "\nFahrenheit: " + converterFahrenheit()
                + "\nKelvin: " + converterKelvin());
    }

}
