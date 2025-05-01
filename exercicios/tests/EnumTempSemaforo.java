package exercicios.tests;

import exercicios.dominio.enumeradores2.TemporizadorSemaforo;

public class EnumTempSemaforo {
    public static void main(String[] args) {
        System.out.println("O semáforo está "+TemporizadorSemaforo.VERDE);
        System.out.println("Seu tempo de permanência é de "+TemporizadorSemaforo.VERDE.getSegundos()+" segundos.\n");
        System.out.println("O semáforo está "+TemporizadorSemaforo.AMARELO);
        System.out.println("Seu tempo de permanência é de "+TemporizadorSemaforo.AMARELO.getSegundos()+" segundos.\n");
        System.out.println("O semáforo está "+TemporizadorSemaforo.VERMELHO);
        System.out.println("Seu tempo de permanência é de "+TemporizadorSemaforo.VERMELHO.getSegundos()+" segundos.\n");
    }
}
