package exercicios.tests.sobreWrappers;
// Conceito de autoboxing e unboxing.
public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Valor do tipo int: "+i);
        Integer i2 = i; //Autoboxing
        System.out.println("Valor do tipo Integer: "+i2);
        int i3 = i2;    //unboxing
        System.out.println("Valor do tipo Integer convertido em int: "+i3);
    }
}
