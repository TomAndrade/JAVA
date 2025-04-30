package aulasPraticas.classTester;

import aulasPraticas.academy.excecoes.ExceptionLogin;
import java.util.Scanner;

public class LoginUsandoExceptions {
    static boolean passou = false;
    public static void main(String[] args) {
        // Como estamos chamando um método que tem tratamento de exceções, o main também precisa trata-lo, para isso,
            //chamamos o catch.
        do{
            try {
                logar();
            } catch (ExceptionLogin e) {
                System.out.println(e.getMessage());
            }
        }while(!passou);
    }
    private static void logar() throws ExceptionLogin {
        // Como esse exercício é do tipo checked, é necessário inserir o throws na assinatura do método.
        Scanner s = new Scanner(System.in);
        String usernameDb = "user";
        String passDb = "abc123";

        System.out.println("User: ");
        String usernameInput = s.nextLine();
        System.out.println("Password: ");
        String passwordInput = s.nextLine();

        if(!usernameInput.equals(usernameDb) || !passwordInput.equals(passDb)){
            throw new ExceptionLogin("Usuário ou senha inválido.");
        }
        System.out.println("Sucesso ao logar.");
        passou = true;
        // Se você consegue prever e tratar o problema, você deve tratar. Se não consegue, então deixa a exceção subir.
    }
}
