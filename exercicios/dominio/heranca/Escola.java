package exercicios.dominio.heranca;

public class Escola {
    private String nome;
    private Aluno[] alunos;

    public Escola(String nome, Aluno[] alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public void listarAlunos(){
        for (Aluno i: alunos){
            System.out.println("Alunos da escola "+nome+": ");
            System.out.println("Nome: "+i.getNome()+"\nIdade: "+i.getIdade());
            System.out.println();
        }
    }
}
