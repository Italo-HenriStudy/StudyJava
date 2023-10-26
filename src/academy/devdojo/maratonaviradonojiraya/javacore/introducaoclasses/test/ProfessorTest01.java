package academy.devdojo.maratonaviradonojiraya.javacore.introducaoclasses.test;

import academy.devdojo.maratonaviradonojiraya.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "José";
        professor.idade = 34;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade +" "+ professor.sexo);
    }
}
