package exercicios.tests;

import exercicios.dominio.enumeradores2.NivelJogo;

public class EnumPontosNivel {
    public static void main(String[] args) {
        System.out.println("Valor base de dificuldade: 100");
        System.out.println("Dificuldade 'Fácil': "+ NivelJogo.Dificuldade.FACIL.getMultiplicadorPontos(100));
        System.out.println("Dificuldade 'Médio': "+ NivelJogo.Dificuldade.MEDIO.getMultiplicadorPontos(100));
        System.out.println("Dificuldade 'Difícil': "+ NivelJogo.Dificuldade.DIFICIL.getMultiplicadorPontos(100));

    }
}
