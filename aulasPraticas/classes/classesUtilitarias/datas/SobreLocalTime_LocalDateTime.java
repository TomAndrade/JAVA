package aulasPraticas.classes.classesUtilitarias.datas;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class SobreLocalTime_LocalDateTime {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.now();
        System.out.println(hora);
        // Use getHour para pegar apenas a hora. também vale para getMinute (minutos) e getSecond (segundos).

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
    }
}
