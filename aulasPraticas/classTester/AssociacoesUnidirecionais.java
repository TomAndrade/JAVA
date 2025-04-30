package aulasPraticas.classTester;

import aulasPraticas.classes.Jogador;
import aulasPraticas.classes.Time;

public class AssociacoesUnidirecionais {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprimir();
    }
}
