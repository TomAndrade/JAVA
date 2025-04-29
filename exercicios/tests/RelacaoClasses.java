package exercicios.tests;

import exercicios.dominio.heranca.Aluno;
import exercicios.dominio.heranca.Escola;

public class RelacaoClasses {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fulano",15);
        Aluno aluno2 = new Aluno("Ciclano",16);
        Aluno aluno3 = new Aluno("Beltrano",14);

        Aluno[] lista = {aluno1,aluno2,aluno3};

        Escola escola = new Escola("EE Walker da Costa Barbosa",lista);

        escola.listarAlunos();

    }
}
