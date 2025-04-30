package aulasPraticas.academy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01_aula23_calculaIR {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var formatarDecimal = new DecimalFormat("0.00");
        String separador = "*";
        System.out.println(separador.repeat(20)+" IR HOLANDÊS "+separador.repeat(20));
        System.out.println();
        while(true) {
            try {
                System.out.print("Digite seu salário (em euros e números depois da vírgula): ");
                var salario = scan.next();
                if (salario.isEmpty()){
                    //Se não tiver nada (por exemplo, apertar o enter)...
                    System.out.println("Digite um valor!");
                    continue;
                }
                if (salario.matches(".*[a-zA-Z].*")){
                    //Uma forma de negar quaisquer caracteres que não sejam números.
                    System.out.println("Digite apenas números.");
                    continue;
                }
                if (salario.contains(",")){
                    //A partir daqui, tentei converter os valores da variável "salario" para um double.
                    //É necessário colocar o replace numa nova variável já que o método retorna uma nova String.
                    var replacesalario = salario.replace(',', '.');
                    //É necessário criar outra variável que irá receber o novo valor convertido.
                    double replacesalario2 = Double.parseDouble(replacesalario);
                    if (replacesalario2>0.00 && replacesalario2<=34712.00){
                        double desconto1 = (9.7 / 100)*replacesalario2;
                        System.out.println("Salário mais baixo. Desconto de 9,7% ("+
                                formatarDecimal.format(desconto1)+
                                "): "+
                                (formatarDecimal.format(replacesalario2-desconto1))
                        );
                    }else if (replacesalario2>=34713.00 && replacesalario2<=68507.00){
                        double desconto2 = (37.35/100)*replacesalario2;
                        System.out.println("Salário médio. Desconto de 37,35% ("+
                                formatarDecimal.format(desconto2)+
                                "): "+
                                formatarDecimal.format(replacesalario2-desconto2)
                        );
                    }else if (replacesalario2>68507.00){
                        double desconto3 = (49.50/100)*replacesalario2;
                        System.out.println("Salário alto. Desconto de 49,50% ("+
                                formatarDecimal.format(desconto3)+
                                "): "+
                                formatarDecimal.format(replacesalario2-desconto3)
                        );
                    }
                    break;
                }else{
                    System.out.println(salario);
                    System.out.println("O cálculo só pode ser feito se digitar o número real e não como inteiro.");
                    break;
                }
            }catch(Exception e){
                System.out.println("Valor inválido!");
                return;
            }
        }
        scan.close();
    }
}
