package exercicios.tests;

import java.util.Calendar;

public class SaberDiaSemanaCadaMes {
    public static void main(String[] args) {
        int ano = 2025;
        int mes = Calendar.MAY;                         // Retorna o dia do mês.
        Calendar calendario = Calendar.getInstance();
        calendario.set(ano,mes,1);
        int sabados = 0;
        
        while (calendario.get(Calendar.MONTH)==mes){    // Até que o calendário seja igual ao dia do mês...
            if (calendario.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                // Se em calendário, o dia da semana for igual ao sábado... Sabado adiciona 1.
                sabados++;
                if (sabados==3){
                    System.out.printf("3º sábado: ¨%tF%n", calendario);
                    break;
                }
            }
            calendario.add(Calendar.DAY_OF_MONTH,1);    // Com isso, adiciona 1 para ir ao mês seguinte.
        }
    }
}
