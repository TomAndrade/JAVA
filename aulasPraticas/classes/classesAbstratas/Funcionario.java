package aulasPraticas.classes.classesAbstratas;
// Como uma classe abstrata é basicamente um "template", não será possível criar um objeto a partir dela e sim
    // a partir das classes filhas (caso estas estendam dela).
// Esta classe foi criada justamente para ser estendida pelas filhas.
// Classes abstratas ou que precisam ser estendidas não podem ser final e vice e versa.
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        bonusSalarial();  // Perceba que estamos forçando o uso do método para todas as classes filhas.
    }
    // Este método é abstrato também pois o cálculo será feito pelos objetos das classes filhas.
    // Isso impede que todos os funcionários recebam esse bonus.
    // Use métodos abstratos a menos que a classe ou subclasse também seja. Um abstrato complementa o outro.
    public abstract void bonusSalarial();
    // A menos que queira sobrescrever este método abstrato, não é necessário implementá-lo nas subclasses, já que a
        // classe mãe já fez esse papel e consequentemente as filhas herdarão essa implementação.
    @Override
    public void imprime() {
        System.out.println();
    }
}
