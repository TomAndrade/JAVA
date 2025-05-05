package aulasPraticas.classes.classesUtilitarias.sobreStrings;

public class UtilitariosStrings {
    public static void main(String[] args) {
        String nome = "   Wellington   ";         // Index 0 a 9;
        System.out.println(nome.charAt(0));       // Seleciona um caractere a partir do número do índice escolhido.
        System.out.println(nome.length());        // Tamanho da cadeia de caracteres.
        System.out.println(nome.replace("W","U"));  // Substitui um caractere por outro.

        System.out.println(nome.substring(0,9));  // Exibe a cadeia de caracteres a partir de um índice inicial e final.
        // Perceba que o último índice será ignorado, pois é exclusivo.

        System.out.println(nome.substring(2));
        // Se inserir apenas o índice inicial, ele mostrará o resto da cadeia de caracteres.

        System.out.println(nome.trim());
        // Remove os espaços em branco existentes da cadeia de caracteres.
    }
}
