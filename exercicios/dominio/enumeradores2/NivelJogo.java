package exercicios.dominio.enumeradores2;
//Objetivo: Encapsular lógica associada às constantes.
public class NivelJogo {
    // Faz mais sentido que o enum Dificuldade fique dentro dessa classe, já que só ela irá usar.
    public enum Dificuldade{
        FACIL {
            @Override
            public double getMultiplicadorPontos (double valor) {
                return valor*0.5;
        }
    },
        MEDIO {
            @Override
            public double getMultiplicadorPontos (double valor) {
                return valor*1;
        }
    },
        DIFICIL {
            @Override
            public double getMultiplicadorPontos (double valor) {
                return valor*1.5;
        }
    } ;

        public abstract double getMultiplicadorPontos (double valor);

            @Override
            public String toString () {
            return super.toString();
        }
    }
    private final int multiBase;
    private final Dificuldade dificuldade;

    public NivelJogo(int multiBase, Dificuldade dificuldade) {
        this.multiBase = multiBase;
        this.dificuldade = dificuldade;
    }

    public int getMultiBase() {
        return multiBase;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }
}
