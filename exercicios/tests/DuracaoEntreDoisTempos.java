package exercicios.tests;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;

public class DuracaoEntreDoisTempos {
    public static void main(String[] args) {
        Random randomizar = new Random();
        LocalTime hora1 = LocalTime.now().minusHours(544);
        LocalTime hora2 = LocalTime.now().plusHours(231);
        Duration duracaoEntre = Duration.between(hora1,hora2);
        Duration duracaoExata = Duration.ofMinutes(90);                 
        Duration duracaoExata2 = Duration.ofHours(2).plusMinutes(20).plusSeconds(10);
        Duration zerarDuracao = Duration.ofDays(randomizar.nextInt(10));
        
        System.out.println("Duração entre dois horários em horas: "+duracaoEntre.toHours());    // Exercício 1
        System.out.println(duracaoExata.plusMinutes(45));                           // Exercício 2
        // Use o get de Duration para mostrar o tempo.
        System.out.println(duracaoExata2.getSeconds());                                         // Exercício 3
        System.out.println(Duration.ZERO);                                                     // Exercício 4
    }
}
