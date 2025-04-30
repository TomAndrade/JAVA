package aulasPraticas.academy;

import java.util.Scanner;

public class Aula25_switch {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        byte day = 0;
        while (day<=0 || day > 7) {
            System.out.print("Digite um dia: ");
            day = scan.nextByte();
            switch (day) {
                case 1,6:
                    System.out.println("Fim de semana.");
                    break;
                case 2,3,4,5,7:
                    System.out.println("Dia útil.");
                    break;
                default:
                    System.out.println("Fora de alcance. Digite entre 1 e 7.");
            }
        }
    }
}
