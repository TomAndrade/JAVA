package aulasPraticas.academy.polimorfismo.servicos;

import aulasPraticas.academy.polimorfismo.Produto;

public class CalcImposto {
    public void calculaImposto(Produto produto){
        System.out.println("Relatório de impostos");
        double imposto = produto.calculaImposto();
        System.out.println("     Produto: "+produto.getNome());
        System.out.println("     Valor: "+produto.getValor());
        System.out.printf("     Imposto a ser pago: %.2f",imposto);
    }
}
