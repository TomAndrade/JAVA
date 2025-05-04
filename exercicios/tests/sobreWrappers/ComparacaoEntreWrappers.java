package exercicios.tests.sobreWrappers;

public class ComparacaoEntreWrappers {
    public static void main(String[] args) {
        Integer object1 = 128;
        Integer object2 = 128;
        System.out.println(object1.equals(object2)); // Será sempre true pois ambos têm o mesmo valor.
        System.out.println(object1==object2);        // Será false, pois as referências na memória são diferentes.
        // Usar '==' faz comparação por referência, enquanto o equals compara os valores.
        // Ao comparar objetos com '==', ele compara se os dois apontam para o mesmo objeto na memória.
    }
}
