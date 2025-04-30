package aulasPraticas.academy;

import aulasPraticas.classes.funcoes;
import aulasPraticas.classes.Endereco;
import aulasPraticas.classes.escolares.*;


public class Cadastra_escolares {
    public static void main(String[] args) {
        funcoes.titulo("CADASTRO DE ESCOLARES");    //Função "título"
        Endereco endereco = new Endereco();               //Chamando a classe Endereço
        Aluno aluno = new Aluno("Well",(short)31);  //Chamando a classe Aluno para definir um aluno.
        Aluno[] alunosSeminarios = {aluno};               //Criando um vetor de Aluno para definir mais de um aluno num seminário (muitos para um);
        endereco.SetRua("Dolores",300);         //Definindo um endereço, especificamente uma rua.
        Professor profe = new Professor("Lucas","História");                    //Chamando um professor.
        Seminarios seminario = new Seminarios("Alinhamento", alunosSeminarios, endereco);   //Definindo um seminário.
        Seminarios[] seminariosDisponiveis = {seminario};                                         //Criando um vetor de seminários disponíveis para o professor.

        profe.setSeminarios(seminariosDisponiveis);
    }
}
