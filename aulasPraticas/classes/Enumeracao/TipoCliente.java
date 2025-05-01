package aulasPraticas.classes.Enumeracao;
// É possível inserir este enum dentro da classe que irá usa-lo.
public enum TipoCliente {
    // As variáveis inseridas em enum devem ser colocadas depois dos atributos desse enum.
    // Atributos podem receber valores de referência a eles.
    // Perceba que as variáveis desse enum só estão aceitando atributos porque o construtor exige isso. Na maioria dos
        //casos, essas variáveis não recebem atributo algum.
    PESSOA_FISICA(1,"Sem restrições"),
    PESSOA_JURIDICA(2,"Com restrições");
    // VALOR é public pois este valor não será alterado. Se for private, tem que ter um getter.
    public final int VALOR;
    private final String restricao;

    TipoCliente(int valor, String restricao) {
        this.VALOR = valor;
        this.restricao = restricao;
    }

    public String getRestricao() {
        return restricao;
    }
}
