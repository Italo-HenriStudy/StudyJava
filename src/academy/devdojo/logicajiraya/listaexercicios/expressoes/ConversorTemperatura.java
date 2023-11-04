package academy.devdojo.logicajiraya.listaexercicios.expressoes;

import java.util.Scanner;

public class ConversorTemperatura {
//    Escreva um programa que realize a conversão de graus Celsius (C) para graus
//    Fahrenheit (F). Utilize a fórmula abaixo:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int escolha;

        System.out.print("Escolha qual unidade deseja converter: ");
        escolha = sc.nextInt();
        System.out.println("[1] Celsius para Fahrenheit");
        System.out.println("[2] Fahrenheit para Celsius");
        System.out.println();

        if (escolha == 1) {
            System.out.print("Digite o valor em Celsius: ");
            celsius = sc.nextDouble();

            fahrenheit = celsius * (9 / 5D) + 32 ;
            String result = String.format("%.2f", fahrenheit);

            System.out.print("Temperatura em Fahrenheit: " + result + "°");
        } else {
            System.out.print("Digite o valor em Fahrenheit: ");
            fahrenheit = sc.nextDouble();

            celsius = (fahrenheit - 32) * (9 / 5D) ;
            String result = String.format("%.2f", celsius);

            System.out.print("Temperatura em Fahrenheit: " + result + "°");
        }
    }
}
