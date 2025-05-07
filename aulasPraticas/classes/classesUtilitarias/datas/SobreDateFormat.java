package aulasPraticas.classes.classesUtilitarias.datas;

import java.text.DateFormat;
import java.util.Calendar;

public class SobreDateFormat {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        // Há 6 formatos de datas, por isso o número 7.
        DateFormat[] dateformat = new DateFormat[7];
        dateformat[0] = DateFormat.getInstance();      // Mostra a data e hora: DIA/MÊS/ANO HORA:MINUTOS
        dateformat[1] = DateFormat.getDateInstance();  // Mostra apenas a data, formato médio: DIA de MÊS (curto) de ANO
        dateformat[2] = DateFormat.getTimeInstance();  // Mostra apenas a hora: HORA:MINUTO:SEGUNDO
        dateformat[3] = DateFormat.getDateInstance(DateFormat.SHORT);   // Mostra apenas a data, curta: DIA/MÊS/ANO
        dateformat[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);  // O mesmo que getDateInstance.
        // Mostra apenas a data, formato longo: X de MÊS (completo) de ANO
        dateformat[5] = DateFormat.getDateInstance(DateFormat.LONG);
        // Mostra a data com o dia da semana, em formato longo: DIA_DA_SEMANA, X de MÊS de ANO.
        dateformat[6] = DateFormat.getDateInstance(DateFormat.FULL);
        
        for (DateFormat df: dateformat){
            System.out.println(df.format(calendario.getTime()));
        }
    }
}
