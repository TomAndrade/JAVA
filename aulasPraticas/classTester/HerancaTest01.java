package aulasPraticas.classTester;

import aulasPraticas.classes.Funcionario;
import aulasPraticas.classes.sobreHeranca.EnderecoPessoa;
import aulasPraticas.classes.sobreHeranca.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        EnderecoPessoa endereco = new EnderecoPessoa();
        Pessoa pessoa = new Pessoa("Fulano");
        Funcionario funcionario = new Funcionario("Beltrano");

        funcionario.setCpf("44426682211");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);

        pessoa.setCpf("41123364418");
        pessoa.setEndereco(endereco);

        endereco.setRua("Rua Dolores");
        endereco.setCep("09711616");

        pessoa.imprime();
        System.out.println();
        funcionario.imprime();

    }
}
