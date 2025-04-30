package aulasPraticas.classes.sobreHeranca;

import aulasPraticas.classes.sobreHeranca.EnderecoPessoa;

public class Pessoa {
    // módulo de acesso protected permite que as classes filhas tenham acesso aos atributos.
    // Permite que classes do mesmo pacote tenham acesso também.
    protected String nome;
    protected String cpf;
    protected EnderecoPessoa endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+", "+this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EnderecoPessoa getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoPessoa endereco) {
        this.endereco = endereco;
    }
}
