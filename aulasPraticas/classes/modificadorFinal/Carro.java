package aulasPraticas.classes.modificadorFinal;
// final pode ser usado em classes e métodos também.
// Se a classe for final, tudo o que há nela também será.
public class Carro {

    private String nome;
    // Tipo primitivo
    public static final double VEL_LIMITE;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }

    static{
        VEL_LIMITE = 250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
