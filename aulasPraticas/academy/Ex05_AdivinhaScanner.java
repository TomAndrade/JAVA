package aulasPraticas.academy;

import java.util.Random;
import java.util.Scanner;

public class Ex05_AdivinhaScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] simnao = {"Sim","Não"};
        Random randomizar = new Random();
        System.out.println("----- Adivinha a resposta ----- "+"\n");
        while(true) {
            System.out.println("Faça uma pergunta e será respondido com sim ou não (digite 'sair' para encerrar: " +
                    "\b");
            String pergunta = scan.nextLine();
            if (pergunta == null || pergunta.equals(" ") || pergunta.isEmpty()) {
                System.out.println("Refaça a pergunta!");
            } else if (pergunta.equalsIgnoreCase("sair")) {
                scan.close();
                break;
            }else{
                System.out.println(simnao[randomizar.nextInt(simnao.length)]);
                System.out.println("Continuar [S/N]? ");
                String continuar = scan.next();
                if (continuar.equalsIgnoreCase("S")){
                    System.out.println();
                }else{
                    scan.close();
                    break;
                }
            }
        }
    }
}
