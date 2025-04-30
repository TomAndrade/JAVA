package aulasPraticas.classes.classesAbstratas;

public class Dev extends Funcionario{
    public Dev(String nome, double salario) {
        super(nome, salario);
        bonusSalarial();
    }
    // Como a classe mãe é abstrata, o método está sendo sobrescrito para ser executado pelo objeto da classe filha.
    @Override
    public void bonusSalarial() {
        this.salario+=this.salario*0.05;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
