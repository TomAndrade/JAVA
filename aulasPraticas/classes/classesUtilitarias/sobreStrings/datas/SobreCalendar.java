package aulasPraticas.classes.classesUtilitarias.sobreStrings.datas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SobreCalendar {
    public static void main(String[] args) {
        // A classe Calendar não pode ser instanciada, apenas as suas subclasses.
        Calendar calendario = new GregorianCalendar();
        // Para criar um objeto do tipo Calendar, é necesário usar o getInstance e não o new.
        Calendar calendarioDate = Calendar.getInstance();
        
        // Date é uma classe legado, porém podemos usa-la para capturar datas de instâncias.
        Date date = calendario.getTime();
        System.out.println("Data atual: "+date);
        // Também é possível saber o dias do ano através de inteiros.
        System.out.println("Dia da semana: "+Calendar.DAY_OF_WEEK);
        System.out.println("Dia do mês: "+Calendar.DAY_OF_MONTH);
        System.out.println("Dia do ano: "+Calendar.DAY_OF_YEAR);
        System.out.println("Dia da semana no mês: "+Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println();
        // Também é possível alterar a data, neste caso o dia e as horas, adiantando 2.
        calendario.add(Calendar.DAY_OF_MONTH,2);
        calendario.add(Calendar.HOUR,2);
        date = calendario.getTime();
        System.out.println(date);
    }
}
