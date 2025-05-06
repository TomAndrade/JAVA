package aulasPraticas.classes.classesUtilitarias.sobreStrings.datas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class SobreNumberFormat {
    public static void main(String[] args) throws ParseException {      // Tratando conversões.
        // Não há uma versão do BRAZIL em Locale. Porém, se o padrão do sistema for pt-br, não é de se preocupar.
        Locale localeEN = Locale.US;
        Locale localeJP = Locale.JAPAN;
        // O NumberFormat é usado para formatar números.
        // Perceba que tanto as classes Calendar e DateFormat, a classe NumberFormat também é abstrata.
        NumberFormat[] numberFormat = new NumberFormat[3];
        
        numberFormat[0] = NumberFormat.getInstance();           // Formato padrão do sistema
        numberFormat[1] = NumberFormat.getInstance(localeEN);   // Formato EN
        numberFormat[2] = NumberFormat.getInstance(localeJP);   // Formato JP

        System.out.println("Versão numérica:");

        double valor = 10_113_320.23995;

        for (NumberFormat nf: numberFormat){
            // Perceba que estamos usando o nf aqui, pois o numberFormat é um array e não do tipo NumberFormat.
            System.out.println(nf.format(valor));
        }        
        
        numberFormat[0] = NumberFormat.getCurrencyInstance();           // Formato padrão do sistema(BR)
        numberFormat[1] = NumberFormat.getCurrencyInstance(localeEN);   // Formato EN
        numberFormat[2] = NumberFormat.getCurrencyInstance(localeJP);   // Formato JP

        double valorMoeda = 10_113_320.23995;

        System.out.println("\nAgora, a versão em moedas:");

        for (NumberFormat nf: numberFormat){
            // Define o número máximo de casas depois da vírgula. Ele arredonda o valor para cima.
            nf.setMaximumFractionDigits(2);  
            System.out.println(nf.format(valorMoeda));
        }
        // Quando há uma String com caracteres especiais, o parse pode não converter ela completamente. Isso pode
            // ignorar o resto da string. Por isso, evite o uso de underlines se for converter em int em algum momento.
        String valormoedaString = "103336,2654";
        NumberFormat converte = NumberFormat.getInstance();
        // O uso do parse do NumberFormat converte o valor em double caso contenha vírgula. Do contrário, vira inteiro.
        // O uso do parse via valor monetário precisa do símbolo monetário na frente do número para funcionar.
        System.out.println(converte.parse(valormoedaString));
    }
}
