package aulasPraticas.classTester;

import aulasPraticas.classes.Jogador;
import aulasPraticas.classes.Time;

//Usar getters e setters evita que os dados principais sejam trocados.
public class GettersSetters {
    public static void main(String[] args) {

        //Objetos que estendem de outros:
        /* Funcionario funca = new Funcionario();
        funca.SetNome("João");
        funca.setIdade((short)50);  //Por algum motivo, teve que ser "castado" como "short".
        funca.setSexo('M');
        System.out.println(funca.getNome());*/

        //Objetos em arrays:
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Neymar");

        Jogador[] jogadores = {jogador1, jogador2,jogador3};

        //Iterando objetos de arrays:
        for (Jogador jogadorFor: jogadores){
            System.out.printf("%s \n",jogadorFor.getNome());
        }

        //Objetos com associação 1 para n (considerando que "time" pertence a um objeto e não a um atributo de Jogador):
        Time time = new Time("Seleção Brasileira");
    }
}
