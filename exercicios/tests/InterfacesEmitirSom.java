package exercicios.tests;

import exercicios.dominio.sobreInterfaces.ex6_implementacaoBasica.Cachorro;
import exercicios.dominio.sobreInterfaces.ex6_implementacaoBasica.Gato;

public class InterfacesEmitirSom {
    public static void main(String[] args) {
        Cachorro catiorro = new Cachorro();
        Gato gato = new Gato();

        catiorro.emiteSom();
        gato.emiteSom();
    }
}
