package academy.devdojo.logicajiraya.Bestruturascondicionais.ifelse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo = 'F';
        int idade = 18;

        if (sexo == 'M' || sexo == 'F') {
            if (sexo == 'M' && idade >= 18) {
                System.out.println("Alistamento Militar Obrigatorio!");
            } else if (sexo == 'F' && idade >= 18) {
                System.out.print("Deseja se alistar? ");
                String resposta = sc.next();
            } else {
                System.out.println("Alistamento não permitido!");
            }
        } else {
            System.out.println("caractere invalido");
        }

    }
}
