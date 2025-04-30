package aulasPraticas.academy;

import java.util.Scanner;

public class Aula21_com_while_try_catch {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        short idade = 0;
        while (true) {
            System.out.print("Insira a idade: ");
            try {
                idade = scan.nextShort();
                if (idade<0 || idade>120){
                    System.out.println("Ops! Parece que você inseriu um valor negativo ou muito grande.");
                    continue;
                }
                if (idade >= 0 && idade <= 12) {
                    System.out.println("Categoria infantil.");
                    break;
                } else if (idade > 12 && idade <= 17) {
                    System.out.println("Categoria juvenil.");
                    break;
                } else if (idade >= 18 && idade<120) {
                    System.out.println("Categoria adulto.");
                    break;
                }
            }catch (Exception e){
                System.out.println("Idade inválida.");
                scan.next();    //Use isso para limpar o buffer do Scanner, senão o loop nunca terminará.
            }
        }
    }
}
