package aulasPraticas.classes.classesUtilitarias.sobreStrings.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SobreSimpleDateFormat {
    public static void main(String[] args) {
        // O SimpleDateFormat é usado para alterar a formatação de uma data de forma mais precisa.
        // Usamos aspas simples para que o SimpleDate ignore o que estiver ali.
        // As letras maiúsculas são os valores por extenso.
        String padraoData = "dd-mm-yyyy 'às' HH:mm:ss";
        // Agora, instanciando com o formato estipulado por uma variável de referência:
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(padraoData);
        // Depois, formatando através do new Date:
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
