package exercicios.tests;

import exercicios.dominio.sobreInterfaces.ex9_polim_e_MultiplaHeranca.Desenho;
import exercicios.dominio.sobreInterfaces.ex9_polim_e_MultiplaHeranca.Movimentavel;
import exercicios.dominio.sobreInterfaces.ex9_polim_e_MultiplaHeranca.Personagem;
import exercicios.dominio.sobreInterfaces.ex9_polim_e_MultiplaHeranca.Sprite;

public class InterfacesPolimComHeranca {
    public static void main(String[] args) {
        // Personagem pode ser tratável por diferentes interfaces, já que implementa uma interface herdando de outras.
        Sprite pessoa1 = new Personagem();
        //Por que usar Movimentável? Restringe o acesso: se você usa Movimentável m, o código só poderá chamar métodos
            // de Movimentável, mesmo que o objeto real tenha mais métodos.
        Movimentavel m = pessoa1;
        m.mover(10);
        //Usando pessoa como interface Desenho:
        Desenho d = pessoa1;
        d.desenhar();

        pessoa1.mover(5);
        pessoa1.desenhar();
    }
}
