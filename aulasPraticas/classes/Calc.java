package aulasPraticas.classes;


public class Calc {
    public void somaNum(int a,int b){
        //Versão sem retorno, mas com parâmetros.
        System.out.println(a+b);
    }
    public double divideInteiro(double a, double b){
        if (b%2==0 || b==0) {
            return 0;       //Isto é útil para poupar processamento.
        }
        return (int)(a/b);
    }

    public void somar(int... num){
        //Varargs - simplificando arrays. Dese estar sempre no início e ter apenas um argumento como parâmetro.
        int soma = 0;
        for(int i: num){
            soma +=i;
        }
        System.out.print(soma);
    }

    public void listar(int... num){
        for (int i: num){
            System.out.print(i + ", ");
        }
    }

    public void funcaoVoidComReturn(int num){
        // É possível usar o return como um break mesmo em métodos void.
        if (num<0) {
            System.out.println("Não aplicável");
            return;
        }
        System.out.println("Caso seja diferente de 0");
    }

    public static void imprimaString(String nome){
        System.out.println(nome);
    }

    public static void imprimaValores(double valor){
        System.out.println(valor);
    }
    
}
