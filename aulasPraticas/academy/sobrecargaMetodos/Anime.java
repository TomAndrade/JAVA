package aulasPraticas.academy.sobrecargaMetodos;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome,tipo,episodios);
        this.genero = genero;
    }

    public void setNome(String nome){this.nome = nome;}

    public String getNome() {
        return this.nome;
    }

    public void mostrarAnime(){
        System.out.println("Nome: "+this.nome+"\n"+"Tipo: "+this.tipo+"\n"+"Episódios: "+this.episodios);
    }

    public void setTipo(String tipo){this.tipo = tipo;}

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodio){this.episodios = episodio;}

    public int getEpisodios() {
        return this.episodios;
    }
}
