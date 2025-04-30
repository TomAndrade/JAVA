package aulasPraticas.classTester;

import aulasPraticas.classes.Enumeracao.Cliente;
import aulasPraticas.classes.Enumeracao.Cliente.TipoPagamento;
import aulasPraticas.classes.Enumeracao.TipoCliente;

public class EnumCliente {
    public static void main(String[] args) {
        // Fazendo sem Enum
        Cliente cliente01 = new Cliente("Fulano", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Ciclano",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente03 = new Cliente("Beltrano",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        // Aplicando o método sobrecarregado oriundo de um enum:
        System.out.println(TipoPagamento.DEBITO.descontos(150));
        System.out.println(TipoPagamento.CREDITO.descontos(175));
    }
}
