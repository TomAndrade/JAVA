package exercicios.tests;

import exercicios.dominio.CalculadoraSimples1;

public class MainCalc1 {
    public static void main(String[] args) {
        CalculadoraSimples1 calc = new CalculadoraSimples1();
        System.out.println("Usando os números 1 e 2.");
        System.out.println("Somando: "+ calc.somar(1,2));
        System.out.println("Subtraindo: "+ calc.subtrair(1,2));
        System.out.println("Multiplicando: "+ calc.multiplicar(1,2));
        System.out.println("Dividindo: "+ calc.dividir(1,2));
    }
}
