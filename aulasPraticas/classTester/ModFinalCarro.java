package aulasPraticas.classTester;

import aulasPraticas.classes.modificadorFinal.Carro;
import aulasPraticas.classes.modificadorFinal.Comprador;
import aulasPraticas.classes.modificadorFinal.Ferrari;

public class ModFinalCarro {
    public static void main(String[] args) {
        Carro car = new Carro();
        Ferrari ferrari = new Ferrari();
        System.out.println(Carro.VEL_LIMITE);   // Uso primitivo.
        car.COMPRADOR.setNome("Fulano");        // Uso com base em referência.
        System.out.println(car.COMPRADOR.getNome());
        ferrari.setNome("Enzo");                // Alterando
        ferrari.imprime();
    }
}
