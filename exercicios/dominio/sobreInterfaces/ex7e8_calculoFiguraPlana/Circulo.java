package exercicios.dominio.sobreInterfaces.ex7e8_calculoFiguraPlana;

public class Circulo implements Figura{
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * (raio*raio);
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
}
