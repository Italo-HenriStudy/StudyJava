package academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.test;

import academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Wesley");
        Professor professor2 = new Professor("Thigatinho");
        Professor professor3 = new Professor("Gota");
        Professor professor4 = new Professor("Negaum");
        Professor[] professores = {professor1, professor2, professor3, professor4};
        Escola escola = new Escola("CED 06", professores);

        escola.imprime();
    }
}
