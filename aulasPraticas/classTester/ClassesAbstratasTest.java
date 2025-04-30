package aulasPraticas.classTester;

import aulasPraticas.classes.classesAbstratas.Dev;
import aulasPraticas.classes.classesAbstratas.Gerente;

public class ClassesAbstratasTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Beltrano",5500);
        Dev desenvolvedor = new Dev("Dev1",3500);
        System.out.println(gerente+"\n"+desenvolvedor);
    }
}
