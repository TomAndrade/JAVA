package exercicios.tests;

import exercicios.dominio.sobreInterfaces.ex10_conversorUnidades.ConversorUnidades;
import exercicios.dominio.sobreInterfaces.ex10_conversorUnidades.Regua;

public class InterfacesConversorUnidades {
    public static void main(String[] args) {
        //Usando as duas formas
        Regua regua = new Regua();
        regua.imprimirConversao(30);
        System.out.printf("Exibindo sem instanciar: %.2f",ConversorUnidades.centimwtrosParaPolegadas(50));
    }
}
