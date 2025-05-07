package aulasPraticas.classes.classesUtilitarias.tempo;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ClassePeriod {
    public static void main(String[] args) {
        // Assim como o Duration calcula períodos de tempo mais com horas, minutos e segundos, a classe Period faz isso
            // com medidas maiores como dias, semanas, meses, anos e até séculos.
        LocalDate data1 = LocalDate.now();
        LocalDate dataDaqui3Anos = LocalDate.now().plusYears(3).plusWeeks(12).
                plusDays(5);
        Period periodo1 = Period.between(data1,dataDaqui3Anos);
        // Enquanto o Duration converte em horas, o Period converte em dias.
        // No Period.of, temos anos, meses, semanas e dias:
        Period periodo2 = Period.ofWeeks(32);
        System.out.println(periodo1);
        // Use o ChronoUnit caso queira mostrar de outra forma que não seja em dias. Neste caso, mostra em meses.
        // Perceba que o(s) objeto(s) envolvido(s) deve(m) ser do tipo Period.
        // Para calcular em horas, teria que usar objetos do tipo Duration.
        System.out.println("Quantos meses têm a partir da data de hoje até daqui a quantidade de semanas em periodo2? "
                +data1.until(data1.plusDays(periodo2.getDays()), ChronoUnit.MONTHS));
        System.out.println("Quantas semanas têm a partir da data de hoje até daqui a quantidade de semanas em periodo2? "
                +data1.until(data1.plusDays(periodo2.getDays()), ChronoUnit.WEEKS));
        System.out.println("Quantos dias têm a partir da data de hoje até daqui a quantidade de semanas em periodo2? "
                +data1.until(data1.plusDays(periodo2.getDays()), ChronoUnit.DAYS));
    }
}
