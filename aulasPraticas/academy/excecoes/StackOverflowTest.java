package aulasPraticas.academy.excecoes;

public class StackOverflowTest {
    // Este código dará um Stack Overflow (estouro de pilha), pois está fazendo uma chamada recursiva infinitamente.
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
