package aulasPraticas.academy.excecoes;

public class ExceptionLogin extends Exception{
    // Para criar a própria exceção, estenda a classe alvo de Exception.
    // Caso de uso checked (forçar checagem).
    // Criar exceptions são mais pesados na JVM, pois criam StackTraces (uma espécie de log do erro).

    public ExceptionLogin(){
        super("Login inválido!");
    }
    public ExceptionLogin(String message) {
        super(message);
    }
}
