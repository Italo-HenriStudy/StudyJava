package academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.test;

import academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar", 10);
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
