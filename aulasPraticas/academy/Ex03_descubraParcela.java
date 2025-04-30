package aulasPraticas.academy;

import java.util.Scanner;

public class Ex03_descubraParcela {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        float valorCarro;
        int parcelas;
        double valorParcela = 0;

        System.out.print("Digite o valor do carro para descobrir quantas parcelas podem ser feitas: ");
        valorCarro = scan.nextFloat();
        for (parcelas=2;valorParcela<=valorCarro;parcelas++){
            valorParcela=valorCarro/parcelas;
            if (valorParcela<1000 || parcelas>60){
                break;
            }
            System.out.printf("Valor mensal se parcelado em %d vezes: R$%.2f \n",parcelas,valorParcela);
        }
    }
}
