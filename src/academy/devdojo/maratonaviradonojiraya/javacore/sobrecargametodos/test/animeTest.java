package academy.devdojo.maratonaviradonojiraya.javacore.sobrecargametodos.test;

import academy.devdojo.maratonaviradonojiraya.javacore.sobrecargametodos.dominio.Anime;

public class animeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 240, "teste");
        anime.imprime();
    }
}
