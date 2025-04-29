package exercicios.tests;

import exercicios.dominio.Pessoa;

public class RestringeIdade {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fulano",19);
        Pessoa pessoa2 = new Pessoa("Ciclano",18);
        Pessoa pessoa3 = new Pessoa("Beltrano",17);

        pessoa1.podeBeber();
        pessoa2.podeBeber();
        pessoa3.podeBeber();
    }
}
