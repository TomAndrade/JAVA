package exercicios.dominio.sobreInterfaces.ex7e8_calculoFiguraPlana;

public interface Figura {
    // Em contexto de interfaces, o uso de varargs não é útil, pois não especifica o que cada argumento é.
    // A interface deve seguir o princípio da responsabilidade única, ou seja, o que estiver nela, não pode ser
        // resolvido por terceiros. Não pode delegar parte da lógica para outros.
    double calcularArea();

    // Como este método é default, ele precisa de um corpo, mesmo que vazio.
    default void imprimirArea(){
        System.out.printf("Àrea: %.2f cm². \n",calcularArea());
    }
    // Métodos com retorno têm corpo também.
    // Métodos estáticos são chamados pela interface e não pelos objetos que a implementam.
    static double converterParaPolegadas(double centimetros){
        return centimetros/2.54;
    }
}
