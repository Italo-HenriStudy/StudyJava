package academy.devdojo.logicajiraya.listaexercicios.expressoes;

import java.util.Scanner;

public class AreaDoCirculo {
    /*
    * Baseado na fórmula abaixo escreva um programa que calcule
    * e apresente a área de um círculo.
    * Formula: A = ΠR^2
    * Onde:
    *   A representa a área do círculo
    *   π = 3.141592654
    *   R = Raio do círculo (deve ser fornecido pelo usuário)
    **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A;
        double pi = 3.141592654;
        double R;

        System.out.print("Digite o Raio do Circulo: ");
        R = sc.nextDouble();

        A =  pi * Math.pow(R, 2);
        String result = String.format("%.2f", A);

        System.out.println("A area do circulo é = " + result);
    }
}
