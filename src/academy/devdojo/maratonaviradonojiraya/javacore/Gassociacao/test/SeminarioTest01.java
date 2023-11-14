package academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.test;

import academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Sorrilândia");
        Aluno aluno1 = new Aluno("Luquinhas", 21);
        Professor professor1 = new Professor("Everaldo", "Português");
        Aluno[] alunos = {aluno1};
        Seminario seminario = new Seminario("Nao sei", local, alunos);
        Seminario[] seminariosDisponiveis = {seminario};
        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprime();
    }
}
