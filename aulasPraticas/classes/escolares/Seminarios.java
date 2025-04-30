package aulasPraticas.classes.escolares;

import aulasPraticas.classes.Endereco;

public class Seminarios {
    private String nome;
    private Aluno[] alunos;
    private Endereco endereco;


    public Seminarios(String nome, Aluno[] alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public Seminarios(String nome, Aluno[] alunos, Endereco endereco) {
        this.nome = nome;
        this.alunos = alunos;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
