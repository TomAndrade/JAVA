package aulasPraticas.academy;
import java.util.Scanner;

/*
Comentários com várias linhas.
 */
//Comentários

/**
 * Comentários <b>formatados.</b>
 * Via <b>javadoc</b>
 */

public class Aulas01a19 {
    public static void main(String[] args) {
        var scan = new Scanner (System.in);
        System.out.println("Aplicações mensais (janeiro):");
        int jan = scan.nextInt();
        int fev = 23;
        int mar = 17;
        int resultado = jan+fev+mar;
        System.out.println("Despesas:" + resultado);
        if (jan+fev==50){
            System.out.println("Lucro");
        }else{                              //lembrete: else fica FORA do if
            System.out.println("Prejuízo");
        }

        // OPERADORES LÓGICOS AND OR E NOT
        int idade = 55;
        float salario = 2500F;
        boolean dentroDaLeiAcimaDe30 = idade > 30 && salario > 4612;
        boolean dentroDaLeiAbaixoDe30 = idade < 30 && salario < 3381;

        // atribuição (+= -= *= /= %= ++ --)
        int bonus =0;
        bonus += 2;
        System.out.println(bonus);
        bonus--;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);
        bonus++;
        System.out.println(bonus);
        --bonus;
        System.out.println(bonus);
        scan.close();
    }
}
