package aulasPraticas.classes;

public class Time {

    private String nomeTime;
    private Jogador[] jogadores;

    public void imprimir(){
        System.out.println(this.nomeTime);
        if (jogadores == null){return;}
        for (Jogador i: jogadores){
            System.out.println(i.getNome());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Time (String nomeTime){
        this.nomeTime = nomeTime;
    }

    public Time(String nomeTime, Jogador[] jogadores) {
        this.nomeTime = nomeTime;
        this.jogadores = jogadores;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }
}
