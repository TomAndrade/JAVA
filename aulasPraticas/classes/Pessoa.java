package aulasPraticas.classes;

public class Pessoa {
    private String nome;
    private short idade;
    private char sexo;

    public void SetNome(String nome){
        this.nome = nome;
    }
    public void setIdade(short idade){ System.out.println(idade<0?"Idade inválida.":"\n");}
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    //Getters não precisam de parâmetros, pois o valor em questão já está em memória.
    public String getNome(){
        return nome;
    }
    public short getIdade(){
        return idade;
    }
    public char getSexo(){
        return sexo;
    }
}
