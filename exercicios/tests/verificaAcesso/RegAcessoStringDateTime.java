package exercicios.tests.verificaAcesso;

public class RegAcessoStringDateTime {
    public static void main(String[] args) {
        // Conceito inicial de registro de acesso por determinado número de usuários.
        Usuarios[] nomes = {new Usuarios("Alice"),new Usuarios("Bob"),new Usuarios("Charles"),
                new Usuarios("Diana"),new Usuarios("Edward")};

        for (Usuarios users: nomes){
            users.registraAcesso();
        }
    }
}
