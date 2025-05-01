package exercicios.tests;

import exercicios.dominio.enumeradores2.DiasDaSemana;

import java.util.Scanner;

public class EnumDiasSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        String diaSemana = scan.nextLine().toLowerCase();

        switch (diaSemana){
            case "segunda":
                System.out.println(DiasDaSemana.SEGUNDA);
                break;
            case "terça","terca":
                System.out.println(DiasDaSemana.TERCA);
                break;
            case "quarta":
                System.out.println(DiasDaSemana.QUARTA);
                break;
            case "quinta":
                System.out.println(DiasDaSemana.QUINTA);
                break;
            case "sexta":
                System.out.println(DiasDaSemana.SEXTA);
                break;
            case "sábado", "sabado":
                System.out.println(DiasDaSemana.SABADO);
                break;
            case "domingo":
                System.out.println(DiasDaSemana.DOMINGO);
                break;
            default:
                System.out.println("Digite um dia da semana!");
        }
    }
}
