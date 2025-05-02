package exercicios.tests;

import exercicios.dominio.sobreInterfaces.ex7e8_calculoFiguraPlana.Circulo;
import exercicios.dominio.sobreInterfaces.ex7e8_calculoFiguraPlana.Figura;
import exercicios.dominio.sobreInterfaces.ex7e8_calculoFiguraPlana.Retangulo;

public class InterfacesCalcArea {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(12,14);
        Circulo circulo = new Circulo(15.2);

        //Perceba que é melhor criar um método default para evitar código duplicado. O método já faz a formatação.
        circulo.imprimirArea();
        retangulo.imprimirArea();
        //System.out.printf("Retângulo: %.3f \n",retangulo.calcularArea());
        //System.out.printf("Círculo: %.3f \n",circulo.calcularArea());
        System.out.printf("Convertendo cm em polegadas: %.2f",Figura.converterParaPolegadas(120));
    }
}
