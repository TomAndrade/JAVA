package aulasPraticas.classes.classesUtilitarias.sobreStrings;

public class PoolDeStrings {
    public static void main(String[] args) {
        // Strings em Java são imutáveis porque, uma vez criadas, seu valor não pode ser alterado. Isso acontece porque
            // a classe String foi projetada como final e seus dados internos são armazenados em um array de caracteres 
            // também final (até o Java 8).

        // Exemplo de uma String literal (pool de strings).
        String nome = "Well"; 
        String nome2 = "Well";
        
        // Esta string está fazendo referência para o objeto nome3 (objeto do tipo String):
        String nome3 = new String("Well"); 
        
        System.out.println(nome == nome2);      // Comparando por referência.
        System.out.println(nome2 == nome3);     
        // Será false, pois nome2 é literal e nome3 não.

        System.out.println(nome2 == nome3.intern());
        // Será true, pois o méto.do intern chama o valor do objeto. Ou seja, diretamente ao pool de strings.
        // Temas então as três formas: variável de referência, objeto do tipo String e uma string do pool de strings.
    }
}
