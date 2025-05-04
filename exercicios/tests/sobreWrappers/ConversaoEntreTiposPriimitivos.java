package exercicios.tests.sobreWrappers;

import java.util.Scanner;
// Conversão entre tipos primitivos usando Wrappers.
public class ConversaoEntreTiposPriimitivos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        String num = s.nextLine();
        // Por que o aviso de que pode ser do tipo primitivo?
            // Evita o autoboxing (conversão automática entre int e Integer), economizando memória e processamento.
            // Como você só usa o valor numericamente, faz sentido usar int.
        Integer conversor = Integer.parseInt(num);
        var conversor2 = Integer.toBinaryString(conversor);
        System.out.printf("Valor de %s em binário: %s %n",num, conversor2);
        conversor2 = Integer.toOctalString(conversor);
        System.out.printf("Valor de %s em octal: %s %n",num, conversor2);
        conversor2 = Integer.toHexString(conversor);
        System.out.printf("Valor de %s em hexadecimal: %s %n",num, conversor2);
    }
}
