package academy.devdojo.maratonaviradonojiraya.javacore.Dconstrutores.test;

import academy.devdojo.maratonaviradonojiraya.javacore.Dconstrutores.dominio.Anime;

public class animeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 240, "teste", "Seila");
        anime.imprime();
    }
}