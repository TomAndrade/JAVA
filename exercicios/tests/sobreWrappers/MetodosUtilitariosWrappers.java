package exercicios.tests.sobreWrappers;
// Convertendo uma string em hexadecimal.
public class MetodosUtilitariosWrappers {
    public static void main(String[] args) {
        String valorHexadecimal = "1c";
        // O que acontece aqui? Ele tenta converter "1c" como se fosse um número decimal (base 10), mas "1c" é um valor
            // hexadecimal (base 16), e a letra "c" não é válida em base 10 — isso lançaria uma exceção do Java.lang.
        Integer converteDecimal = Integer.parseInt(valorHexadecimal,16);
        // A resolução seria inserir a base hexadecimal em 'radix'. Neste caso, o 16.
        System.out.printf("O valor %s em hexadecimal é %d.",valorHexadecimal, converteDecimal);
    }
}
