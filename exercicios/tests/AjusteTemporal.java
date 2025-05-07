package exercicios.tests;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObtemProxDiaUtil implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek diaDaSemana = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        //LocalDate.now().getDayOfWeek();
        // Um switch melhorado, onde a variável recebe o valor quando a variável alvo cair em um dos casos.
        int addDias = switch (diaDaSemana) {
            case THURSDAY -> 4;
            case FRIDAY -> 3;
            case SATURDAY -> 2;
            default -> 1;
        };
        return temporal.plus(addDias, ChronoUnit.DAYS);
    }
}

public class AjusteTemporal {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        // Abaixo, eu quero saber qual o próximo dia útil a partir de hoje:
        agora = LocalDate.now().with(new ObtemProxDiaUtil());
        System.out.println(agora);
        // Abaixo, quero saber qual o próximo dia útil a partir do dia do mês escolhido:
        agora = LocalDate.now().withDayOfMonth(12).with(new ObtemProxDiaUtil());
        System.out.println(agora);
    }
}
