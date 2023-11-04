package academy.devdojo.logicajiraya.Darrays.unidimensional;

import java.util.Scanner;

public class Aula03ExercicioArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1, vetor2, vetorResultado;
        int tamanhoDoArray;

        System.out.print("Digite o numero do tamanho dos arrays que deseja: ");
        tamanhoDoArray = sc.nextInt();

        vetor1 = new int[tamanhoDoArray];
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o " + (i + 1) + " numero do vetor1: ");
            vetor1[i] = sc.nextInt();
        }
        System.out.println();

        vetor2 = new int[tamanhoDoArray];
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Digite o " + (i + 1) + " numero do vetor2: ");
            vetor2[i] = sc.nextInt();
        }
        System.out.println();

        vetorResultado = new int[tamanhoDoArray];
        for (int i = 0; i < vetorResultado.length; i++) {
            vetorResultado[i] = vetor1[i] * vetor2[i];
        }

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("vetor1[" + (i + 1) + "]: " + vetor1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("vetor2[" + (i + 1) + "]: " + vetor2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < vetorResultado.length; i++) {
            System.out.println("vetorResultado[" + (i + 1) + "]: " + vetorResultado[i] + " ");
        }
    }
}
