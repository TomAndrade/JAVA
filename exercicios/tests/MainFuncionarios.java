package exercicios.tests;

import exercicios.dominio.Funcionario;

public class MainFuncionarios {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("João");
        Funcionario funcionario02 = new Funcionario("Maria");
        Funcionario funcionario03 = new Funcionario("José");
        Funcionario funcionario04 = new Funcionario("Ana");

        System.out.print("Número total de funcionários registrados: ");

        Funcionario.mostrarTotalFuncionarios();
    }
}
