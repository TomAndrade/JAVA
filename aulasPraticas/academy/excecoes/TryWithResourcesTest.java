package aulasPraticas.academy.excecoes;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivoImplementando();
    }
    public static void lerArquivoImplementando(){
        // Como dito anteriormente, ou use o throws na assinatura (aplicando no main também) ou use o catch para
        // tratar a exceção. É possível instanciar quantos objetos quiser dentro de try, desde que seja Closeable.
        try (SobrescrevendoCloseable implementado = new SobrescrevendoCloseable()){
            System.out.println();
        }catch (IOException e){
            System.out.println("Exceção tratada.");
        }
    }
    public static void lerArquivoFormaCorreta() throws IOException{
        /*Só é possível instanciar objetos no try se estes forem do tipo Closeable ou AutoCloseable. Em outras
            palavras, que possam usar o método close(). É possível implementa-la.
            O BufferedReader é criado dentro do try() — então o Java automaticamente chama close() ao terminar o bloco.
            Isso evita o uso do finally e o NullPointerException.
         */
        try(Reader reader = new BufferedReader(new FileReader("teste2.txt"))) {

        }
    }

    public static void lerArquivoFormaErrada(){
        //ESTA É UMA FORMA ERRÔNEA DE LER ARQUIVOS.
        // Sempre declare a variável fora do try, por questões óbvias. Você vai usa-la outras vezes.
        Reader reader = null;
        // BufferedReader é uma classe que permite trabalhar com arquivos de forma mais eficiente, usando buffer.
        try {
            // Perceba que o arquivo em questão não existe, então será necessário tratar esse erro aplicando uma
                // assinatura no método ou usando um try-catch.
            reader = new BufferedReader(new FileReader("teste2.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Erro ao completar a solicitação.");
            }
        }
        /*
        Explicação longa:
        Se o new FileReader("teste2.txt") falhar (arquivo não existe), o reader nunca é inicializado (fica null).
        Então no finally, quando faz reader.close(), vai gerar uma nova exceção: um NullPointerException.
        Ou seja: você está tentando fechar um objeto que pode nem ter sido criado.
         */
    }
}
