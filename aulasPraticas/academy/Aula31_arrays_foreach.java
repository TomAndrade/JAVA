package aulasPraticas.academy;

import java.util.Random;

public class Aula31_arrays_foreach {
    public static void main(String[] args) {
        var rand = new Random();
        int[] idades = new int[3];  //requer inicializador
        for (int i = 0; i < idades.length; i++) {
            idades[i] = rand.nextInt(100);
            System.out.printf("Idade (posição %d): %d\n", i, idades[i]);
        }
        System.out.println();

        /*for(int num:idades){                              //foreach não funciona em arrays sem tamanho predefinido.
        *   System.out.printf("Usando o foreach: %d \n",idades[num]);
        }*/
    }   // O foreach lê cada elemento por vez, mesmo que seja um array ou coleção com múltiplos elementos.
}
