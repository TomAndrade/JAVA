package aulasPraticas.academy;

import java.util.Random;

public class Aula36_matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        int[] arrayExemplo = {1,2,3,4,5};
        int[][] matrizIndefinida = new int[4][]; // Uma matriz que pode ter arrays de tamanhos variados.
        matrizIndefinida[0] = new int[1];       // Como o array não foi definido antes, é necessário usar o new.
        matrizIndefinida[1] = new int[2];
        matrizIndefinida[2] = new int[3];
        matrizIndefinida[3] = arrayExemplo; // É possível usar arrays com tamanhos predefinidos como uma posição também.

        var rand = new Random();
        for (int i=0;i< matriz.length;i++){   // Incrementa um valor de  i desde que seja menor que o tamanho da matriz.
            for (int j = 0;j<matriz[i].length;j++){   // Incrementa um valor de j desde que seja menor que o valor de i.
                matriz[i][j] = rand.nextInt(100);              // Adiciona um número aleatório na posição j de i.
                System.out.printf("Valor da posição [%d][%d]: %d \n",i,j,matriz[i][j]);
            }
        }
        int pos1 = 0;
        int pos2 = 0;
        System.out.println();
        System.out.println("Agora dentro de um foreach:");
        for (int[] base:matriz){    //variável de referência.
            for (int num: base){    //variável de varredura que será usada pela base.
                System.out.printf("Base: [%d], Posição: [%d], Valor de num -> %d \n", pos1,pos2,num);
                pos2++;
            }
            pos1++;
            pos2=0;
        }
    }
}
