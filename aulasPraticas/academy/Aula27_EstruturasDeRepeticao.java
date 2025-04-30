package aulasPraticas.academy;

public class Aula27_EstruturasDeRepeticao {
    public static void main(String[] args) {
        for (int i = 0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println();
        // A mesma coisa, só que usando o while.
        int contar = 0;
        while(contar < 10){
            System.out.println(++contar);
        }
        System.out.println();
        contar = 0;
        // O while sempre verificará se a condição pode ser atendida. No caso do-while, ele primeiro faz o que deve ser
        // feito e depois verifica se a condição foi atendida.
        do{
            System.out.println(++contar);
        }while(contar < 10);
    }
}
