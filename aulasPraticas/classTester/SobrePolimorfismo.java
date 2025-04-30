package aulasPraticas.classTester;

import aulasPraticas.academy.polimorfismo.Computador;
import aulasPraticas.academy.polimorfismo.Produto;
import aulasPraticas.academy.polimorfismo.Televisao;
import aulasPraticas.academy.polimorfismo.Tomate;
import aulasPraticas.academy.polimorfismo.servicos.CalcImposto;

// Polimorfismo só é aplicável no modelo de Herança;
public class SobrePolimorfismo {
    public static void main(String[] args) {
        // Esta conversão é chamada de Widening Cast (conversão automática).
        // Como Computador e Tomate pertencem a Produto, objetos do tipo Produto automaticamente são convertidos assim.
        Produto computador = new Computador("ABEX-12",2500);
        Produto tomate = new Tomate("Holandês",11.89);
        Produto tv = new Televisao("Asteros A44c",1599);
        CalcImposto imposto = new CalcImposto();

        imposto.calculaImposto(computador);
        System.out.println();
        imposto.calculaImposto(tomate);
        System.out.println();
        imposto.calculaImposto(tv);
    }
}
