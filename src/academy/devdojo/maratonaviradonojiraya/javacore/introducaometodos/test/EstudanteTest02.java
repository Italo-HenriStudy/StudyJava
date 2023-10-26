package academy.devdojo.maratonaviradonojiraya.javacore.introducaometodos.test;

import academy.devdojo.maratonaviradonojiraya.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Goku";
        estudante01.idade = 25;
        estudante01.sexo = 'M';

        estudante02.nome = "Vegeta";
        estudante02.idade = 25;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
