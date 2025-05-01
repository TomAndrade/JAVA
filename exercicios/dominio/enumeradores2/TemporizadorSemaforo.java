package exercicios.dominio.enumeradores2;
//Objetivo: Adicionar dados extras a cada constante.
public enum TemporizadorSemaforo {
    VERMELHO(75),
    AMARELO(5),
    VERDE(15);

    private final int segundos;

    TemporizadorSemaforo(int segundos) {
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }
}
