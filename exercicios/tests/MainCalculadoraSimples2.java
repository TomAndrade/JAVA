package exercicios.tests;

import exercicios.dominio.calculadoraSimples2.TipoOperacao;

public class MainCalculadoraSimples2 {
    public static void main(String[] args) {
        System.out.printf("Somando: %.2f %n",TipoOperacao.SOMA.calcular(1,2));
        System.out.printf("Subtraindo: %.2f %n",TipoOperacao.SUBTRACAO.calcular(1,2));
        System.out.printf("Multiplicando: %.2f %n",TipoOperacao.MULTIPLICACAO.calcular(1,2));
        System.out.printf("Dividindo: %.2f %n",TipoOperacao.DIVISAO.calcular(1,2));

    }
}
