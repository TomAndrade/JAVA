package aulasPraticas.classes.modificadorStatic.testes;

import aulasPraticas.classes.modificadorStatic.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro car1 = new Carro("Porsche 911",330);
        Carro car2 = new Carro("Citroen C3",200);
        Carro car3 = new Carro("Mercedes C200",320);

        Carro.setVelLimite(180);

        car1.imprimir();
        car2.imprimir();
        car3.imprimir();

    }
}
