package academy.devdojo.maratonaviradonojiraya.javacore.Eblocosinicializacao.test;
import academy.devdojo.maratonaviradonojiraya.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        System.out.println(anime.getNome());
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
        System.out.println();

        //construtor sem argumentos
        System.out.println();
        Anime anime1 = new Anime();
    }
}
