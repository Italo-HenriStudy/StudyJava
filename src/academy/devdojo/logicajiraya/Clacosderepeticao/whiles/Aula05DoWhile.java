package academy.devdojo.logicajiraya.Clacosderepeticao.whiles;
import java.util.Scanner;

//do vai ser executado ao menos uma vez antes de verificar se while é true
public class Aula05DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("PLAYER 1: Digite um número de 1 a 10: ");
            int num1 = sc.nextInt();
            System.out.print("PLAYER 2: Digite um número de 1 a 10: ");
            int num2 = sc.nextInt();

            System.out.println("Acertou: " + (num1 == num2));

            System.out.println("----------------------------------------------");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            desejaContinuar = sc.nextInt();
        } while(desejaContinuar == 1);
    }
}
