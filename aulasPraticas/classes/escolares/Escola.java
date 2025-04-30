package aulasPraticas.classes.escolares;

public class Escola {

    private String nome;
    private Professor[] professores;

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprimir(){
        System.out.println(this.nome);
        if (professores == null){return;}
        for (Professor i: professores){
            System.out.println(i.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
