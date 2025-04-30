package aulasPraticas.academy.polimorfismo;

public class Tomate extends Produto{
    public static final double IMPOSTO_DEFERIDO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando imposto de "+this.nome);
        return this.valor*IMPOSTO_DEFERIDO;
    }
}
