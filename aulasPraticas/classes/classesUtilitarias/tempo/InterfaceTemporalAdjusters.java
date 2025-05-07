package aulasPraticas.classes.classesUtilitarias.tempo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class InterfaceTemporalAdjusters {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        // Use o with para ajustar apenas o que deve ser alterado.
        // O valor deve ser explícito, ou seja, deve definir que dia (1 a 31), mês (1 a 12) ou ano escolher.
        LocalDate saltarXMeses = agora.withMonth(10);
        LocalDate saltarXDias = agora.withDayOfMonth(10);
        LocalDate saltarXAnos = agora.withYear(2011);

        System.out.println(agora);                              // Exibe a data atual
        System.out.println(saltarXMeses);                       // Saltou para outubro (5 meses)
        System.out.println(saltarXDias);                        // Saltou para o dia 10 (3 dias).
        System.out.println(saltarXAnos);                        // Saltou para 2011 (14 anos).
        System.out.println();
        // Use o TemporalAdjusters caso queira ajustar saltos temporais específicos, tais como: saltar do dia 20 ate o
            // dia 20 do mês seguinte.
        // Abaixo, eu quero pegar a data atual com TemporalAdjusters definido para a próxima quarta-feira:
        agora = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(agora);
        // Agora, usando o previous, mostrando a última quarta-feira.
        agora = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
        System.out.println(agora);
    }
}
