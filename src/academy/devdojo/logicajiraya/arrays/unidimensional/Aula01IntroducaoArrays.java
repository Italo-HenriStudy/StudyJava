package academy.devdojo.logicajiraya.arrays.unidimensional;

import java.util.Scanner;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroNotas;
        String nomeAluno;
        double somaNotas = 0;
        double calculoMedia;
        double[] notas;
        String resultado;

        System.out.print("Digite o nome do aluno: ");
        nomeAluno = sc.nextLine();

        System.out.print("Digite quantas notas de " + nomeAluno + " deseja adicionar: ");
        numeroNotas = sc.nextInt();

        notas = new double[numeroNotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "°" + " nota de " + nomeAluno + ": ");
            notas[i] = sc.nextDouble();
            somaNotas = somaNotas + notas[i];
        }

        calculoMedia = somaNotas / numeroNotas;
        resultado = String.format("%.2f", calculoMedia);
        System.out.println("A media de " + nomeAluno + " foi de: " + resultado);
    }
}
