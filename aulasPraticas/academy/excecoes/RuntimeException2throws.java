package aulasPraticas.academy.excecoes;

public class RuntimeException2throws {
    public static void main(String[] args) {
        divideZero(1,0);
        divideZero2(1,0);
    }
    // Quando você coloca uma exceção na assinatura do método, você é obrigado a trata-la.
    public static int divideZero(int a, int b) { //throws Exception e
        if (b<=0){
            throw new ArithmeticException("Denominador inválido!");
        }
        return a/b;
    }
    public static int divideZero2(int a, int b) {
        int a2 = 1;
        int b2 = 0;
        try {
            boolean completo;
        } catch (java.lang.RuntimeException e) {
            System.out.println();
        }
        return a/b;
    }
}
