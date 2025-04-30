package aulasPraticas.classTester;

import aulasPraticas.classes.Calc;
import aulasPraticas.classes.Funcionario;
import aulasPraticas.classes.escolares.Aluno;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random randomizar= new Random();
        Aluno aluno = new Aluno("João", 30);
        /*Pessoa estudante1 = new Pessoa();        //Transforma a classe Pessoa num objeto chamado estudante1.
        estudante1.nome = "Well";
        estudante1.idade = 31;
        estudante1.sexo = 'M';

        Carro auto1 = new Carro();
        auto1.nome = "Toyota";
        auto1.modelo = "Etios";
        auto1.ano = 2015;

        Carro auto2 = new Carro();
        auto2.nome = "Ford";
        auto2.modelo = "Ka";
        auto2.ano = 2005;

        auto1 = auto2; // Uma forma de fazer com que um objeto aponte para outro já existente.
                       // Uma vez feito, a informação anterior do objeto será perdida.

        System.out.println("Nome: " + estudante1.nome + "\n" +
                "Idade: " + estudante1.idade + "\n" +
                "Sexo: " + estudante1.sexo);*/

        /*Calc s = new Calc();
        s.somaNum(10,10);
        System.out.println(s.divideInteiro(12,4));*/

        /*Calc lista = new Calc();
        lista.somar(51,65,5,48,36,77);
        System.out.println();
        lista.listar(51,65,5,48,36,77);*/

        /*funca.nome = "João";
        funca.idade = 35;
        funca.sexo = 'M';
        int trimestre1 = funca.salario = randomizar.nextInt()*3500;
        int trimestre2 = funca.salario = randomizar.nextInt()*3500;
        int trimestre3 = funca.salario = randomizar.nextInt()*3500;
        do{
            trimestre1 = funca.salario = randomizar.nextInt(3500);
        }while(trimestre1<3300);
        do{
            trimestre2 = funca.salario = randomizar.nextInt(3500);
        }while(trimestre2<3300);
        do{
            trimestre3 = funca.salario = randomizar.nextInt(3500);
        }while(trimestre3<3300);
        double media = (trimestre1+trimestre3+trimestre2)/3f;
        System.out.println();
        System.out.println(trimestre1);
        System.out.println(trimestre2);
        System.out.println(trimestre3);
        System.out.printf("Média trimestral: R$%.2f \n",media);*/

        Calc.imprimaString(aluno.getNome()); // Não é possível passar um objeto como argumento. O argumento (neste caso)
                                                // deve ser do tipo String.
    }
}
