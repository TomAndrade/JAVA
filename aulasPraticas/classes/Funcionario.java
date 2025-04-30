package aulasPraticas.classes;

import aulasPraticas.classes.sobreHeranca.Pessoa;

//Quando uma classe estende de outra, chamamos de sub-classe
public class Funcionario extends Pessoa {
    public double salario;

    // Este construtor herda do construtor de Pessoa. Serve como um placeholder para construtores filhos.
    // Basicamente diz: "Pegue tudo do construtor pai e adicione aqui".
    public Funcionario(String nome){
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Foi recebido de "+this.getNome()+ "a quantia de "+this.salario);
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
