package exercicios.dominio.enumeradores2;
//Objetivo: Manipular enums dentro de um bloco switch.
public enum DiasDaSemana {
    // Perceba que os atributos só podem ser aplicados caso haja um construtor para implementá-los.
    SEGUNDA(1,"Hoje é segunda-feira."), TERCA(2,"Hoje é terça-feira."),
    QUARTA(1,"Hoje é quarta-feira."), QUINTA(4,"Hoje é quinta-feira."),
    SEXTA(5,"Hoje é sexta-feira."), SABADO(6,"Hoje é sábado, fim de semana!"),
    DOMINGO(7,"Hoje e domingo, fim de semana!");

    private final int ident;
    private final String descricao;

    DiasDaSemana(int ident, String descricao){
        this.ident = ident;
        this.descricao = descricao;
    }

    public int getIdent() {
        return ident;
    }

    public String getDescricao() {
        return descricao;
    }
    // Você pode usar tanto o toString como o getter para exibir atributos.
    @Override
    public String toString() {
        return descricao;
    }
}
