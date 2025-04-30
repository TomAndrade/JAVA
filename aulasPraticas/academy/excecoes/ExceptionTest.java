package aulasPraticas.academy.excecoes;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    // Todas as exceções serão tratadas desde o main.
    public static void main(String[] args) throws IOException {
        criaNovoArquivo();
    }
    private static void criaNovoArquivo() throws IOException{
        File file = new File("D:\\JAVA\\intelliJProjects\\maratona\\teste.txt");
        try{
            boolean criou = file.createNewFile();
            if (criou){
                System.out.println("Arquivo criado com sucesso!");
            }
        }catch(IOException e){
            // Nunca deixe o catch vazio!
            System.out.println("Erro ao criar o arquivo: "+e.getMessage());
            // Quando ocorrer a exceção, faça novamente.
            // Só relance uma exceção se realmente quer parar o programa.
            throw e;
        }
    }
}
