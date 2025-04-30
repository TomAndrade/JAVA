package aulasPraticas.academy;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class MostrarData {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String comando;
        System.out.println("- Digite 'data' para mostrar a data atual formatada.");
        System.out.println("- Digite 'hora' para mostrar a hora local formatada.");
        System.out.println("- Digite 'nova-data' para alterar a data (formato dd/mm/aaaa).");
        System.out.println("- Digite 'nova-hora' para alterar a hora (formato hh:mm:ss).\n");
        System.out.print("Insira o comando: ");
        comando = scan.next();
        switch(comando.toLowerCase()) { // avalia texto do 1o argumento e o transforma todas as letras em minúsculas.
            case "data":
                System.out.println(DateFormat.getDateInstance().format(new Date()));
                break;
            case "hora":
                System.out.println(DateFormat.getTimeInstance().format(new Date()));
                break;
            case "nova-data":
                System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy")));
                break;
            case "nova-hora":
                System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
                break;
            default:
                System.out.println("Comando nao reconhecido.");
        }
    }
}
