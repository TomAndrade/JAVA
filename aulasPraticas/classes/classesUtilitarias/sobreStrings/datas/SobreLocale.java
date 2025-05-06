package aulasPraticas.classes.classesUtilitarias.sobreStrings.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SobreLocale {
    public static void main(String[] args) {
        // O uso do construtor Locale foi depreciado.
        // Escolher o local também altera o idioma que será mostrado.
        Locale localeITA = Locale.ITALY;
        Calendar calendario  = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeITA);
        System.out.println(dateFormat.format(calendario.getTime()));
        System.out.println(localeITA.getDisplayCountry());
        System.out.println();
        for (String isoCountries: Locale.getISOCountries()){
            // Irá mostrar as siglas dos países em letra maiúscula separando-os com um espaço.
            System.out.print(isoCountries + " ");
        }
        System.out.println();
        for (String isoLang: Locale.getISOLanguages()){
            // Irá mostrar as siglas dos idiomas em letras minúsculas separando-as com um espaço.
            System.out.print(isoLang + " ");
        }
    }
}
