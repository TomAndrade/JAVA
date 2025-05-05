package aulasPraticas.classes.classesUtilitarias.sobreStrings;

public class StringsPerformanceTest {
    public static void main(String[] args) {
        concatChars(10_000);
        concatComStringBuilder(100_000);
        concatComStringBuffer(100_000);
    }
    // Um méthodo que concatena caracteres ou cadeia de caracteres para o pool de strings:
    private static void concatChars (int tamanho){
        String texto = "";
        long inicioMillis = System.currentTimeMillis();
        System.out.println("Executando via pool...");
        for (int i=0;i<tamanho;i++){
            texto+=i;
        }
        long finalMillis = System.currentTimeMillis();
        System.out.printf("Tempo no pool de strings via referência: %d ms. %n",finalMillis-inicioMillis);
    }
    // Agora, usando o StringBuilder que simplesmente joga o conteúdo inteiro no mesmo espaço de memória:
    private static void concatComStringBuilder (int tamanho){
        long inicioMillis = System.currentTimeMillis();
        StringBuilder construtor = new StringBuilder(tamanho);
        System.out.println("\nExecutando via StringBuilder...");
        for (int i=0;i<tamanho;i++){
            construtor.append(i);
        }
        long finalMillis = System.currentTimeMillis();
        System.out.printf("Tempo no pool de strings via StringBuilder: %d ms. %n",finalMillis-inicioMillis);
    }    
    // Agora, usando o StringBuilder que simplesmente joga o conteúdo inteiro no mesmo espaço de memória:
    // A diferença entre o Builder e o Buffer é que este último é usado quando trabalhamos com threads (múlti tarefas).
    private static void concatComStringBuffer (int tamanho){
        long inicioMillis = System.currentTimeMillis();
        StringBuffer construtor = new StringBuffer(tamanho);
        System.out.println("\nExecutando via StringBuffer...");
        for (int i=0;i<tamanho;i++){
            construtor.append(i);
        }
        long finalMillis = System.currentTimeMillis();
        System.out.printf("Tempo no pool de strings via StringBuffer: %d ms. %n",finalMillis-inicioMillis);
    }
}
