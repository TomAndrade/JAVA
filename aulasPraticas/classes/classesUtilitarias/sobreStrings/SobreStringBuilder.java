package aulasPraticas.classes.classesUtilitarias.sobreStrings;

public class SobreStringBuilder {
    public static void main(String[] args) {
        String nome = "Fulano";
        
        // StringBuilder é uma classe e não do tipo String, por isso, não é possível fazer conversão de tipos aqui.
        StringBuilder construtor = new StringBuilder(nome);
        // Se você não especificar o tamanho da cadeia de caracteres, ele irá padronizar para 16 caracteres.

        construtor.append(" da Silva").append(" Fonseca");
        // Se quiser adicionar uma cadeia de caracteres a um objeto do tipo StringBuilder, use o méthodo append.
        // É possível usar o append diversas vezes numa mesma linha.

        // Dependendo do objeto que o StringBuilder irá trabalhar, você pode ter retornos inesperados. Por exemplo,
            // no caso do substring, ele irá retornar uma String e não um StringBuilder. Para contornar isso, é viável
            // criar uma nova variável do tipo String que irá receber esse valor.
        String converteConstrutor = construtor.substring(0,3);

        System.out.println(converteConstrutor);
        System.out.println(construtor);
    }
}
