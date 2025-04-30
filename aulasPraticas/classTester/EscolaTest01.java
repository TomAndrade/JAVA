package aulasPraticas.classTester;

import aulasPraticas.classes.escolares.Professor;
import aulasPraticas.classes.escolares.Escola;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Escola Estadual", professores);

        escola.imprimir();
    }
}
