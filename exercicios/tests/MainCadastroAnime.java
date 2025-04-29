package exercicios.tests;

import exercicios.dominio.CadastroAnime;

public class MainCadastroAnime {
    public static void main(String[] args) {
        CadastroAnime anime1 = new CadastroAnime("YuYu Hakusho","Ação",173);
        CadastroAnime anime2 = new CadastroAnime("Sakura Cardcaptors","Aventura",64);
        CadastroAnime anime3 = new CadastroAnime("Bleach","Ação",566);

        anime1.exibir();
        anime2.exibir();
        anime3.exibir();

    }
}
