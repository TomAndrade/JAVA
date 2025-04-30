package aulasPraticas.classes.classesAbstratas;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
        bonusSalarial();
    }

    @Override
    public void bonusSalarial() {
        // Perceba que o método funciona mesmo se estiver vazio, pois é uma espécie de "contrato" para com a classe mãe
            // que este método exista em todas as filhas.
        this.salario+=this.salario*0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
