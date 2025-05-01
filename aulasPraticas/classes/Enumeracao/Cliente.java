package aulasPraticas.classes.Enumeracao;
// Inserir um enum dentro da classe limita o acesso para outras classes.
// Caso decida usar enum dentro de uma classe, certifique-se que apenas esta irá usa-lo.
public class Cliente {
    public enum TipoPagamento {
        DEBITO {
            // Sobrescrevendo métodos dentro de enumeradores que estão dentro de classes.
            @Override
            public double descontos(double valor) {
                return valor * 0.1;       // Aplicação de 10% de desconto.
            }
        }, CREDITO {
            @Override
            public double descontos(double valor) {
                return valor * 0.05;       // Aplicação de 5% de desconto.
            }
        };

        // Este método é abstrato pois precisa ser sobrescrito em outra parte do código, por isso não tem um "corpo".
        // Não esqueça de dizer que é um método público.
        public abstract double descontos(double valor);
    }
    private String nome;
    private TipoCliente tipoCliente;
    private final TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getRestricao() +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
