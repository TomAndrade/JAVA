package aulasPraticas.classTester;

import aulasPraticas.classes.Endereco;

public class Construtores {
    public static void main(String[] args) {
        //Através de um construtor, podemos definir parâmetros sem a necessidade de criar métodos sobrecarregados.
        Endereco endereco = new Endereco("SP","São Bernardo do Campo","Ferrazópolis"," ");
        //Assim como métodos sobrecarregados, agora podemos sobrecarregar o construtor sem precisar dos parâmetros.
        Endereco endereco2 = new Endereco();
    }
}
