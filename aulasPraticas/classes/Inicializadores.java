package aulasPraticas.classes;

import java.util.Random;

public class Inicializadores {
    Random randomizar = new Random();

    private String serie;
    private int[] episodios = new int[randomizar.nextInt(24)];

    //Bloco de inicialização. Usado para inicializar primeiro.
    {
        for (int i = 1; i<episodios.length;i++){
            System.out.print(i+", ");
            episodios[i]+=1;
        }
    }

    public Inicializadores(){
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setEpisodios(int [] episodios){
        this.episodios = episodios;
    }

    public String getSerie(){
        return this.serie;
    }

    public int[] getEpisodios(){
        return this.episodios;
    }

}
