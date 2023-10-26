package academy.devdojo.logicajiraya.estruturascondicionais.switchcase;

import java.util.Scanner;

//Receba um número inteiro de 1 a 7 do usuário e imprima o dia da semana correspondente
public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 7: ");
        int diaDaSemana = sc.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println(diaDaSemana + " = Domingo");
                break;
            case 2:
                System.out.println(diaDaSemana + " = Segunda-Feira");
                break;
            case 3:
                System.out.println(diaDaSemana + " = Terça-Feira");
                break;
            case 4:
                System.out.println(diaDaSemana + " = Quarta-feira");
                break;
            case 5:
                System.out.println(diaDaSemana + " = Quinta-Feira");
                break;
            case 6:
                System.out.println(diaDaSemana + " = Sexta-Feira");
                break;
            case 7:
                System.out.println(diaDaSemana + " = Sábado");
                break;
            default:
                System.out.println("Dia Inválido");
        }
    }
}
