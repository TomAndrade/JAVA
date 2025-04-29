package exercicios.dominio;
//Objetivo: Praticar variável estática compartilhada entre objetos.
public class Funcionario {
    String nome;
    static int totalFuncionarios = 0;

    public Funcionario(String nome) {
        this.nome = nome;
        totalFuncionarios ++;
    }

    public static void mostrarTotalFuncionarios(){
        System.out.println(totalFuncionarios);
    }
}
