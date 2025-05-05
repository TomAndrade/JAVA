package exercicios.tests;

import java.util.Random;

public class ConversaFiada {
    public static void main(String[] args) {
        Random randomizar = new Random();
        String comentario = "T: You fit in this dress. You're beautiful.";
        String [] condicao2 = {"V: Do you like my dress?","V: What do you want, T? Say it once for all!", 
                "V: *No answers.*"};
        System.out.println(comentario+"\n");
        
        switch (randomizar.nextInt(condicao2.length)){
            case 0:
                System.out.println(condicao2[0]);
                System.out.println("\nT: Yea, you're very sexy!");
                break;
            case 1:
                System.out.println(condicao2[1]);
                System.out.println("\nT: Ok, ok. I'm out...");
                break;
            case 2:
                System.out.println(condicao2[2]);
                System.out.println("\nT: Err... Ok.");
                break;
            default:
                System.out.println("Random number is out of bounds.");
                break;
        }
    }
}
