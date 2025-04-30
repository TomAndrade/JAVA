package aulasPraticas.academy.excecoes;

public class RuntimeException3finally {
    public static void main(String[] args) {
        algoAcontece();
    }
    private static String algoAcontece(){
        try {
            System.out.println("Algo acontecendo...");
            return "Aconteceu com sucesso!";
        } catch (Exception e) {
            System.out.println();
            // O finally é executado independentemente da exceção.
        } finally {
            System.out.println("Encerrado.");
        }
        //Use este retorno caso ocorra algo inesperado.
        return null;
    }
}
