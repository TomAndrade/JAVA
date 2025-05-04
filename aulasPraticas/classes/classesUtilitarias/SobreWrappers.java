package aulasPraticas.classes.classesUtilitarias;

public class SobreWrappers {
    public static void main(String[] args) {
        // Wrappers tratam os tipos primitivos como objetos.
        // Wrappers obrigatoriamente precisam ser explícitos. Por isso necessitam das letras após o valor, caso sejam
            //do tipo Number.
        // Autoboxing é quando o Java converte automaticamente uma variável em um objeto Wrapper correspondente.
        // Unboxing é o contrário: converte um Wrapper em tipo primitivo correspondente.
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 10;  // Autoboxing. Perceba que a IDE sugere que este objeto pode ser do tipo primitivo,
                                // já que está sendo convertido em int.
        Long longW = 100L;
        Float floatW = 100F;
        Double doubleW = 100D;
        Character charW = 'W';
        Boolean boolW = false;

        int intPrimitivo = intW;                    // Convertendo um Wrapper Integer em int (Unboxing).
        Integer intW2 = Integer.parseInt("10");  // Convertendo um número de String no tipo inteiro (Integer).
        // Parse pode ser usado para converter uma String no tipo primitivo correspondente. Parse é IgnoreCase.
        Boolean isVerdade = Boolean.parseBoolean("TrUe"); // O resultado sempre será verdadeiro.
    }
}
