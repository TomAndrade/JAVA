package exercicios.dominio;

// Objetivo: Praticar atributos, construtores e métodos de instância.
public class CadastroAnime {
    String nome;
    String genero;
    int episodios;

    public CadastroAnime(String nome, String genero, int episodios) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
    }

    public void exibir(){
        System.out.println("Nome: "+this.nome+"\nGênero: "+this.genero+"\nEpisódios: "+this.episodios+"\n");
    }
}
