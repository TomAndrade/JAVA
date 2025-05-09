package exercicios.tests;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class CalculaTempoTarefas {
    // Variáveis globais criam acoplamento: Acoplamento é o grau de dependência entre partes do código. Quanto mais um
        // pedaço depende do outro para funcionar, mais acoplado ele está.
    // Se você tiver centenas de métodos, pode perder o controle de quem está alterando esse valor e quando. Isso torna
        // o código mais frágil: mudar uma parte sem saber que ela depende disso pode quebrar outra.
    // Use static ou globais somente quando o valor for universal e constante (ex: PI, uma configuração fixa).
    static Random randomizar = new Random();
    
    public static void main(String[] args) {
        LocalTime carimboHora = LocalTime.now();
        
        System.out.println(carimboHora.truncatedTo(ChronoUnit.SECONDS));
        System.out.println(executaTarefa());
    }
    public static String executaTarefa(){
        LocalTime tarefa = LocalTime.now().plusMinutes(randomizar.nextInt(0,132));
        boolean pausa = randomizar.nextBoolean();
        Duration duracaoDaPausa = Duration.ZERO;
        Duration duracaoTarefa = Duration.between(LocalTime.now(),tarefa);
        
        if (!pausa){
            System.out.println("Sem pausa.");
        }else{
            LocalTime tempoDaPausaAbs = tarefa.plusMinutes(randomizar.nextInt(15));
            duracaoDaPausa = Duration.between(tarefa,tempoDaPausaAbs);
        }
        if (!duracaoTarefa.isZero()){
            return "Tempo decorrido da tarefa: "+duracaoTarefa.toMinutes()+" minutos.\nPausa (se houve alguma): "+
                    duracaoDaPausa.toMinutes() + " minutos.\n";
        }
        return "O tempo de duração da tarefa é nulo.";
    }
}
