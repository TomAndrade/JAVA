package aulasPraticas.classes.modificadorStatic;

public class Carro {

    private String nome;
    private double velMax;
    private static double velLimite = 250;

    public void imprimir(){
        System.out.println("---------------------");
        System.out.println("Nome: "+this.nome+"\n"+"Velocidade Máxima: "+this.velMax+"\n"+"Limite de velocidade: "+
                Carro.velLimite);
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public static double getVelLimite() {
        return velLimite;
    }
    // método estático

    public static void setVelLimite(double velLimite) {
        Carro.velLimite = velLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro(String nome, double velMax) {
        this.nome = nome;
        this.velMax = velMax;
    }
}
