package aulasPraticas.classes.classesAbstratas;

public abstract class Pessoa {
    // Se a classe filha for abstrata também, não será necessário implementar este método nela. Porém, se houver
        // qualquer subclasse que não seja abstrata, a filha terá que implementar este método abstrato para que as
        // filhas dela possam usa-lo.
    public abstract void imprime();
}
