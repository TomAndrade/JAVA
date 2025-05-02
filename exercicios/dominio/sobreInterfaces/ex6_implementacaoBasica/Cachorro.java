package exercicios.dominio.sobreInterfaces.ex6_implementacaoBasica;

public class Cachorro implements Animal{
    @Override
    public void emiteSom() {
        System.out.println("AuAu!");
    }
}
