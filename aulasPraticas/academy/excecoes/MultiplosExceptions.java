package aulasPraticas.academy.excecoes;

public class MultiplosExceptions {
    public static void main(String[] args) {
        try{
            System.out.println();
            // Duas ou mais exceções dentro do mesmo catch só é válido se elas não forem "filhas da mesma mãe",
            // porque isso é considerado "redundante" para o Java. Ou use a exceção genérica ou use apenas uma exceção.
            // Quando se trata múltiplas exceções no mesmo catch, o Java considera que a variável "e" é final, ou seja,
                //não pode ser alterada (constante).
        }catch(ArithmeticException | IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            System.out.println();
        }
            System.out.println("Exceção aritmética.");
        //Quanto mais genérica a exceção, mais para trás ela tem que ficar dos catches. O motivo é simples: muitas
            // exceções são filhas de outras, por isso, se colocar RuntimeException (por exemplo) primeiro que suas
            // filhas, estas serão completamente ignoradas.
    }
}
