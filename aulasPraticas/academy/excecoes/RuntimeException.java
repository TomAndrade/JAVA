package aulasPraticas.academy.excecoes;

public class RuntimeException {
    public static void main(String[] args) {
        // Erro de tempo de execução. Neste caso, o NullPointerException (apontando para algo que é nulo).
        Object objeto = null;
        System.out.println(objeto.toString());
        // Erro ArrayIUndexOutOfBounds (posição fora dos limites).
        int[] numeros = {1,2};
        System.out.println(numeros[2]);

    }
}
