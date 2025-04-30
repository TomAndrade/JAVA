package aulasPraticas.academy;
import java.util.Random;

public class Aula22_ternarios {
    public static void main(String[] args) {
        var gerar = new Random();
        int n1 = gerar.nextInt(10);
        int n2 = gerar.nextInt(10);

        //Usando variáveis
        System.out.println("Ternário através de uma variável: ");
        System.out.print("n1 é maior que n2?: ");
        String condicao = (n1>n2)?"Verdade":"Falso";    //ternário
        System.out.println(condicao + "\n"+"Valor de n1: "+n1+"\n"+"Valor de n2: "+n2);

        //Sem usar variáveis
        System.out.println();
        System.out.println("Ternário através de um print sem precisar declarar uma variável:");
        System.out.println(n1%2==0?"n1 é par. Valor: "+n1:"n1 é ímpar. Valor: "+n1);
        System.out.println(n2%2==0?"n2 é par. Valor: "+n2:"n2 é ímpar. Valor: "+n2);
    }
}
