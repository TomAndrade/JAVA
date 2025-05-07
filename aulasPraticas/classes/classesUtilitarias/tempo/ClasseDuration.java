package aulasPraticas.classes.classesUtilitarias.tempo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ClasseDuration {
    public static void main(String[] args) {
        // A clase Duration serve para tratar o tempo de algo, como saber o intervalo de tempo entre A e B.
        // A classe trata segundos e nanossegundos.
        // todo A classe LocalDate é incompatível pois esta não trata os segundos.
        // Para não ficar confuso, o LocalDateTime trabalha com datas, o LocalTime trabalha com dias, horas e minutos e
            //o Instant em segundos e nanossegundos. Não necessariamente desta forma, mas semelhante.
        // O Duration calcula a distância de valores entre objetos dessas classes.
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime daqui2Anos = LocalDateTime.now().plusYears(2);
        LocalTime tempoAgora = LocalTime.now();
        LocalTime tempodaqui7Horas = LocalTime.now().plusHours(7);

        Duration duracao = Duration.between(agora,daqui2Anos);              // Calcula o tempo entre dois períodos.
        // Se passar diretamente, irá mostrar um valor em padrão ISO 8601.
        // A letra P indica que é um período; a letra T indica que se trata de tempo; a letra H as horas; M, minutos e
            // a letra S, os segundos.
        System.out.println(duracao);
        Duration duracao2 = Duration.between(tempoAgora,tempodaqui7Horas);
        System.out.println(duracao2);
        Duration duracao3 = Duration.ofDays(20);                            // Mostra a quantidade de horas de X dias.
        // Usando com o ChronoUnit. Cuidado, não dá suporte a todos os atributos.
        Duration duracao4 = Duration.of(4, ChronoUnit.HOURS);
        // Perceba que o ofDays retorna em horas e não em dias.
        // O Duration também tem ofMinutes, ofHours, ofMillis, ofNanos e ofSeconds.
        System.out.println(duracao3);
        System.out.println(duracao4);
    }
}
