package exercicios.tests;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class UsandoTodosLocals {
    public static void main(String[] args) {
        Random randomizar = new Random();
        LocalDate data = LocalDate.of(randomizar.nextInt(1900,2025),randomizar.nextInt(1,12),
                randomizar.nextInt(1,31));
        LocalTime hora = LocalTime.of(randomizar.nextInt(0,23), randomizar.nextInt(0,59),
                randomizar.nextInt(0,59));
        System.out.println(data);
        System.out.println(hora);
    }
}
