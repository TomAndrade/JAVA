package aulasPraticas.academy;

public class Ex02_aula28_exibeNumPar {
    public static void main(String[] args) {
        int pares = 0;
        int num = 0;
        while(num<25){
            System.out.println(num);
            num++;
            if (num % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Números pares: "+pares);
    }
}
