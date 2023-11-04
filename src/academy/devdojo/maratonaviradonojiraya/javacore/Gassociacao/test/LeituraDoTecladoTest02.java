package academy.devdojo.maratonaviradonojiraya.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte desligar = 1;
        byte contador = 0;
        System.out.println("O Grande Software de Previsão do Futuro");
        while (desligar == 1) {
            System.out.println("Digite sua pergunta e eu responderei 'SIM' ou 'NÃO':");
            String pergunta = sc.nextLine();

            if (pergunta.charAt(0) == ' ') {
                System.out.println("SIM");
            } else {
                System.out.println("NÃO");
            }

            contador++;
            if (contador == 3) desligar = 0;
        }
    }
}