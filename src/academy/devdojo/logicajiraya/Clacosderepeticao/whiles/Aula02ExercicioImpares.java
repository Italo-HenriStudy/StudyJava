package academy.devdojo.logicajiraya.Clacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de quantas vezes irá se repetir: ");
        int contador = sc.nextInt();

        int i = 0;
        while (i <= contador){
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
