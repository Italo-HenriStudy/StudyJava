package academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.test;

import academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu", 10);
        Jogador jogador2 = new Jogador("Romário", 9);
        Jogador jogador3 = new Jogador("Dida", 1);
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        Time time = new Time("Selação Brasileira", jogadores);


        time.setJogadores(jogadores);

        System.out.println("--- Jogador --");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
        System.out.println("--- Time --");
        time.imprime();
    }
}
