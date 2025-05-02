package exercicios.dominio.sobreInterfaces.ex9_polim_e_MultiplaHeranca;

public class Personagem implements Sprite{
    private double posicao;

    @Override
    public void desenhar() {
        System.out.println("Personagem na posição "+this.posicao+"\n");
    }

    @Override
    public void mover(double distancia) {
        posicao+=distancia;
        System.out.printf("Personagem se moveu %.2f de distância.\n",distancia);
    }

    @Override
    public void moverTudo(Movimentavel moveTudo) {
        moveTudo.mover(1);
    }

    public Personagem() {
        this.posicao = 0.0;
    }

    public double getPosicao() {
        return posicao;
    }

}
