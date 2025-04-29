package exercicios.dominio;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void podeBeber(){
        if (this.idade<18){
            System.out.println(this.nome+" não pode beber, pois ele tem "+this.idade+" anos ainda.");
        }else{
            System.out.println(this.nome+" pode beber, pois tem "+this.idade+" anos.");
        }
    }
}
