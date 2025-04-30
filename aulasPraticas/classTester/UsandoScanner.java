package aulasPraticas.classTester;

import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input geral: ");
        String input = scan.nextLine();
        System.out.println(input);
        System.out.print("Input para inteiros: ");
        int input2 = scan.nextInt();
        System.out.println(input2);
        System.out.println("Input para caractere: ");
        char sexo = scan.next().charAt(0);      //O zero significa que irá pegar o primeiro caractere do array.
        System.out.println(sexo);


    }
}
