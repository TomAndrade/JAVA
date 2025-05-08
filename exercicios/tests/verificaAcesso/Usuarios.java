package exercicios.tests.verificaAcesso;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Usuarios {
    String nome;
    Action acao;
    Result resultado;

    public Usuarios(String nome) {
        this.nome = nome;
        this.acao = Action.getRandom();               // O usuário pega o méthodo estático de Action para gerar a ação.
        this.resultado = Result.getRandom();          // O mesmo com Result;
    }

    public void registraAcesso(){                    // Toda vez que é chamado, irá registrar os dados.
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
        System.out.printf("[%s %s] USER:%s ACTION:%s RESULT:%s%n",data, hora, nome, acao, resultado);
    }

    public enum Action {
        LOGIN,
        LOGOUT;
        //Abaixo, há três constantes: a primeira pega os valores que estiverem nela mesma.
            // A segunda armazena o tamanho do array. Neste caso, sempre será 2.
            // A terceira é a constante de Random, o que gera valores.
        // Sempre será 2 pois o values sempre retorna um array com todas as constantes declaradas do enum, na ordem
            // em que foram escritas.
        private static final Action[] VALUES = values();
        private static final int SIZE = values().length;
        private static final Random RANDOM = new Random();

        public static Action getRandom(){           // Toda vez que é chamado, gera os dois valores necessários.
            return VALUES[RANDOM.nextInt(SIZE)];
        }
    }
    public enum Result {                            // O mesmo vale para Result.
        SUCCESS,
        FAILURE;

        private static final Result[] VALUES = values();
        private static final int SIZE = values().length;
        private static final Random RANDOM = new Random();

        public static Result getRandom(){
            return VALUES[RANDOM.nextInt(SIZE)];
        }
    }
}
