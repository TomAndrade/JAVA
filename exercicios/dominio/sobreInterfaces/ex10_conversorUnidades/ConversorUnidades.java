package exercicios.dominio.sobreInterfaces.ex10_conversorUnidades;

public interface ConversorUnidades {
    //Aqui foi criado dois métodos, um estático - caso queira calcular diretamente sem instanciar objetos - e outro
        //que irá imprimir o cálculo que foi feito com o número que foi passado como parâmetro.
    static double centimwtrosParaPolegadas(double centimetros){
        return centimetros/2.54;
    }

    default void imprimirConversao(double cm){
        System.out.printf("Convertendo via objeto: %.2f %n",centimwtrosParaPolegadas(cm));
    }
}
