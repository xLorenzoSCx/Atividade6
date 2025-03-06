package atividade6_1;

public class ManipulacaoString {

    private String palavra;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int contarCaractere(String palavra) {
        return palavra.length();
    }

    public void VerificarImparPar(String palavra) {
        if (contarCaractere(palavra) % 2 == 0) {
            System.out.println("O números de caracteres de " + palavra + " é par");

        } else {
            System.out.println("O números de caracteres de " + palavra + " é impar");
        }
    }

    public String inverter(String palavra) {
        StringBuilder textoInvertido = new StringBuilder(palavra);
        return textoInvertido.reverse().toString();
    }

}
