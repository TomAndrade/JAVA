package aulasPraticas.classes;

public class Jogador {

    private String nome;
    private Time time;

    public void imprimir(){
        System.out.println();
        if (time != null){
            // Isso evita nullPointer, é necessário apontar a que se refere.
            System.out.println(time.getNomeTime());
        }
    }

    public Jogador (String nome){
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
