package aulasPraticas.classes.classesUtilitarias.tempo;

import java.time.Instant;
import java.time.LocalDateTime;

public class ClasseInstant {
    public static void main(String[] args) {
        // Enquanto a classe Date trabalha com milissegundos, a classe Instant trabalha com nanossegundos.
        // Instant é exatamente como o LocalDateTime, só que contém nanossegundos.
        Instant nano = Instant.now();
        LocalDateTime milli = LocalDateTime.now();
        System.out.println(nano);
        // A letra Z no final representa o Zulu Time (hora neutra ou hora absoluta).
        System.out.println(milli);
        // Irá exibir apenas o valor em nanossegundo de segundo (1 bilhão de nanosseg):
        System.out.println(nano.getNano());
    }
}
