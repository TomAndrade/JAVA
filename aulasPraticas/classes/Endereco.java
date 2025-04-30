package aulasPraticas.classes;

public class Endereco {
    public String estado;
    public String cidade;
    public String bairro;
    public String complemento;
    private String rua;
    private int num;

    //Use a sobrecarga de métodos caso ocorra que uma classe tenha muitos atributos.
    //Qualquer método é inicializado pelo construtor, mas na maior parte das vezes, não é necessário especificar.
    //É possível chamar um construtor dentro de outro usando o "this()".

    //Super-construtor;
    public Endereco(){
    }

    //Este construtor em questão só está sendo usado para referenciar outro construtor.
    public Endereco(String estado, String cidade, String bairro){
        this();
        // Usar this() é obrigatório para chamar um construtor e sempre deve ser o primeiro.
        // Em outras palavras, significa o seguinte: "Pegue tudo do super-construtor também".
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
    }
    //Sobrecarga de construtores, no qual está usando argumentos de outro construtor.
    public Endereco(String estado, String cidade, String bairro, String complemento){
        this(estado,cidade,bairro);    //Significa o seguinte: "Pegue tudo do construtor que contenha esses parâmetros."
        this.complemento = complemento;
    }
    public void SetRua(String rua, int num){
        this.rua = rua;
        this.num = num;
    }

    public String getRua() {
        return rua;
    }
    public int getNum(){
        return num;
    }
}
