package exercicios.dominio.sobreInterfaces.ex7e8_calculoFiguraPlana;

import org.w3c.dom.ls.LSOutput;

public class Retangulo implements Figura{
    double altura;
    double largura;

    @Override
    public double calcularArea() {
        return altura*largura;
    }

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
}
