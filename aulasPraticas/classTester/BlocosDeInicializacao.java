package aulasPraticas.classTester;

import aulasPraticas.classes.Inicializadores;

public class BlocosDeInicializacao {
    public static void main(String[] args) {
        Inicializadores iniciar = new Inicializadores();
        iniciar.setSerie("Supernatural");
        // Perceba que, independentemente da ordem, o bloco de inicialização será o primeiro a ser executado.
        System.out.println("\n"+"Série: "+iniciar.getSerie());
        iniciar.getEpisodios();
    }
}
