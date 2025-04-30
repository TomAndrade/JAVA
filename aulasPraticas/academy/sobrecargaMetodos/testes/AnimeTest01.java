package aulasPraticas.academy.sobrecargaMetodos.testes;

import aulasPraticas.academy.sobrecargaMetodos.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Boku no Hero Academia","TV",12,"Ação/ Aventura");    // Sobrecarga de métodos.

        anime.mostrarAnime();
    }
}
