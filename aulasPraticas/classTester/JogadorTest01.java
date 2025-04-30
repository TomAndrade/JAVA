package aulasPraticas.classTester;

import aulasPraticas.classes.Jogador;
import aulasPraticas.classes.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");
        Jogador jogador2 = new Jogador("Pepe");
        Jogador jogador3 = new Jogador("Vito");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};
        Time time = new Time("Portugal");

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        //Associação bidirecional.
        time.setJogadores(jogadores);

        System.out.println("---Jogadores---");
        for (Jogador i: jogadores){
            System.out.println(i.getNome());
        }
        System.out.println();
        System.out.println("---Time---");
        time.imprimir();
    }
}
