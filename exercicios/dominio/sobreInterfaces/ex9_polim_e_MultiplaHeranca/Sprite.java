package exercicios.dominio.sobreInterfaces.ex9_polim_e_MultiplaHeranca;
// Uma interface que estende de outra.
public interface Sprite extends Movimentavel, Desenho{
    // Use este método caso outra classe além de Personagem possa se mover.
    void moverTudo(Movimentavel moveTudo);
}
