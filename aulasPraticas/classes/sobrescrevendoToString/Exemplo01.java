package aulasPraticas.classes.sobrescrevendoToString;

public class Exemplo01 {
    private String nome;

    // Um método que sobrescreve o método toString().

    @Override
    public String toString(){
        return "Sobrescrevendo o toString com: "+this.nome;
    }

    public Exemplo01(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
