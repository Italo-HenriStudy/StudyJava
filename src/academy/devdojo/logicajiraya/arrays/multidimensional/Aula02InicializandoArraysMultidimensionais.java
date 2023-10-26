package academy.devdojo.logicajiraya.arrays.multidimensional;

public class Aula02InicializandoArraysMultidimensionais {
    public static void main(String[] args) {
        int multDiagonalPrincipal = 1;
        int[][] arrayMulti1 = new int[3][3];

        arrayMulti1[0][0] = 3;
        arrayMulti1[0][1] = 0;
        arrayMulti1[0][2] = 0;
        arrayMulti1[1][0] = 0;
        arrayMulti1[1][1] = 3;
        arrayMulti1[1][2] = 0;
        arrayMulti1[2][0] = 0;
        arrayMulti1[2][1] = 0;
        arrayMulti1[2][2] = 3;

        System.out.print("Diagonal Principal: ");
        for (int i = 0; i < arrayMulti1.length; i++) {
            System.out.print(arrayMulti1[i][i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arrayMulti1.length; i++) {
            multDiagonalPrincipal = arrayMulti1[i][i] * multDiagonalPrincipal;
        }

        System.out.println("Multiplicação da diagonal: " + multDiagonalPrincipal);
    }
}
