package aulasPraticas.classes.classesUtilitarias.tempo;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ClasseChronoUnit {
    public static void main(String[] args) {
        // O LocalDateTime.of necessita dos seguintes valores: ano, mês, dia, hora, minuto, segundo.
        LocalDateTime niver = LocalDateTime.of(1993,Month.FEBRUARY,2,10,0,0);
        // Basicamente, o ChronoUnit trata de todos os valores relacionados a tempo.
        // Também usa o between para calcular valores entre períodos.
        System.out.println(ChronoUnit.DAYS.between(niver,LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(niver,LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(niver,LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(niver,LocalDateTime.now()));
    }
}
