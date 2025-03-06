/*Método para atualizar o número de páginas lidas (não ultrapassando o
total).
o Método para exibir o progresso da leitura (em porcentagem).
o Desafio extra: Método para indicar se a leitura está completa.
 */
package atividade6_9;

public class Livro {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginasLidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public void verificarPaginas(int paginaAtual) {
        setPaginasLidas(paginasLidas + paginaAtual);

    }
    
    public double verificarPorcentagem(){
    return ((double)paginasLidas/totalPaginas)*100;
    }
    
    public void verificarCompletude(){
        if(paginasLidas==totalPaginas){
            System.out.println("Este livro está completo");
        }
        else{System.out.println("Ainda faltam " + (totalPaginas-paginasLidas));}
    }

}
