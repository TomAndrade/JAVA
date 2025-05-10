package exercicios.tests;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class DuracaoEntreDuasDatas {
    public static void main(String[] args) {
        Random randomizarData = new Random();
        Scanner scan = new Scanner(System.in);
        LocalDate dataPredefinida = LocalDate.of(randomizarData.nextInt(1900,2025),
                randomizarData.nextInt(1,12),
                randomizarData.nextInt(1,31));
        LocalDate dataAgora = LocalDate.now();
        Period periodo = Period.between(dataPredefinida,dataAgora);

        System.out.println("Data pre-estabelecida: "+dataPredefinida);
        System.out.println("\nDiferença entre a data pre-estabelecida e agora: ");
        System.out.printf("Anos: %d%nMeses: %d%nDias: %d%n",periodo.getYears(),periodo.getMonths(),periodo.getDays());

        System.out.print("Agora, insira uma data respeitando o seguinte formato \"yyyy-mm-dd\": ");
        String data = scan.nextLine();
        periodo = Period.between(LocalDate.parse(data),dataAgora);
        System.out.printf("Você tem %d anos, %d meses e %d dias vividos.",periodo.getYears(),periodo.getMonths(),
                periodo.getDays());
        
    }
}
