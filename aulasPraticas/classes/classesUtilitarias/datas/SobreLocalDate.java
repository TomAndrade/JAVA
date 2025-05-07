package aulasPraticas.classes.classesUtilitarias.datas;

import java.time.LocalDate;

public class SobreLocalDate {
    public static void main(String[] args) {
        // O LocalDate é a forma mais simples de se trabalhar com datas e horários.
        // É recomendado usar este para casos em que os dados serão usados para propósitos supérfluos.
        // O LocalDate, LocalTime e LocalDateTime são extremamente úteis para com banco de dados.
        LocalDate localDate = LocalDate.of(1993,2,10);
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.lengthOfMonth());      // Para saber se o mês atual termina no dia 30 ou 31.
        System.out.println(localDate.lengthOfYear());       // Para saber a quantidade total de dias no ano atual.
        System.out.println(localDate.isLeapYear());         // Para saber se o ano é bissexto.
        // Use plus ou minus para adicionar ou remover dias, semanas, meses ou anos.
        localDate = localDate.plusWeeks(12);
        System.out.println(localDate);
    }
}
