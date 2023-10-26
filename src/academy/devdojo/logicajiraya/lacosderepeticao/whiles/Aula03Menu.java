package academy.devdojo.logicajiraya.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operacao = 0;

        while (operacao != 3){
            System.out.println("[1] Calcular Imposto");
            System.out.println("[2] Depositar Salário");
            System.out.println("[3] Sair");
            operacao = sc.nextInt();
        }
        System.out.println("Programa encerrado!");
    }
}
