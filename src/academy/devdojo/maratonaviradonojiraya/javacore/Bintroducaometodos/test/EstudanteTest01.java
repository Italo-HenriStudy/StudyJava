package academy.devdojo.maratonaviradonojiraya.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonaviradonojiraya.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonaviradonojiraya.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Goku";
        estudante01.idade = 25;
        estudante01.sexo = 'M';

        estudante02.nome = "Vegeta";
        estudante02.idade = 25;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        System.out.println("---------");
        impressora.imprime(estudante02);

    }
}
