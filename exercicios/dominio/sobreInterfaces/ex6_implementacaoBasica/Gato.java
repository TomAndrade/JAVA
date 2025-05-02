package exercicios.dominio.sobreInterfaces.ex6_implementacaoBasica;

public class Gato implements Animal{
    @Override
    public void emiteSom() {
        System.out.println("Miau!");
    }
}
