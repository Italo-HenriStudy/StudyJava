package academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.test;
import academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé", 10);
        Jogador jogador2 = new Jogador("Romário", 9);
        Jogador jogador3 = new Jogador("Cafú", 12);
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}