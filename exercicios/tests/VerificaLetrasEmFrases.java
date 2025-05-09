package exercicios.tests;

public class VerificaLetrasEmFrases {
    // Esta variável precisa ser estática, ao contrário, teria que ou chamar via objeto ou via classe diretamente.
    public static String frase = "O rato roeu a roupa do rei de Roma.";
    public static String letra = "R";
    
    public static void main(String[] args) {
        System.out.println(frase+"\n");
        verificaLetra(frase,letra);
        quantasVezesAparece('a');
        System.out.println();
        //System.out.println(removeEspacos(frase));
        substituiLetras(frase);
    }
    
    public static void verificaLetra(String frase, String letra){
        // Use startsWith para saber se tal letra começa na frase.
        if (!frase.toLowerCase().startsWith(letra.toLowerCase())){
            System.out.println("A frase não começa com a letra "+letra);
            return;
        }
        System.out.printf("A frase %s começa com a letra %s.",frase,letra);
    }
    // TODO Para converter um char em String, use Character.toString(caractere) ou String.valueOf(caractere).
    public static void quantasVezesAparece(char letra){
        int vezesAparece=0;
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)==letra){
                vezesAparece++;
            }
        }
        System.out.printf("A letra %s aparece %d vezes.",letra,vezesAparece);
    }
    public static void inverteString(StringBuilder string){
        // Apenas o StringBuilder contém o reverse.
        string.reverse();
    }
    public static String removeEspacos(String string){
        // Use o strip para truncar espaços no início e no fim de uma frase.
        return string.strip();
    }
    public static void substituiLetras(String string){
        string = string.toLowerCase();
        // O méthodo replace(String oldChar, String newChar) substitui todas as ocorrências da string "oldChar" pela
            // "newChar", desde que o tipo passado seja String.
        string = string.replace("a","*");
        string = string.replace("e","*");
        string = string.replace("i","*");
        string = string.replace("o","*");
        string = string.replace("u","*");

        System.out.println(string);
        
        // O replaceAll substitui todos os caracteres que forem passados em regex.
        // O comando (?i) torna a busca case-insensitive (ignora maiúsculas/minúsculas).
        //return string.replaceAll("(?i)[aeiou]","*");
        
    }
}
