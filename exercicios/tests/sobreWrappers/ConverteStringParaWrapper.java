package exercicios.tests.sobreWrappers;
// Convertendo uma String para Wrapper com Scanner.
import java.util.Scanner;

public class ConverteStringParaWrapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        String conversor = scan.nextLine();
        Double convertaDouble = Double.parseDouble(conversor);
        // Por que foi sugerido usar o ValueOf? Porque se você precisa de um objeto Double, valueOf() é mais direto.
        // Porém, se você quer apenas usar o número como tipo primitivo double, usar o parse é melhor.
        System.out.println(convertaDouble);

    }
}
