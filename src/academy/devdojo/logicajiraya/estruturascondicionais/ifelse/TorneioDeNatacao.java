package academy.devdojo.logicajiraya.estruturascondicionais.ifelse;

import java.util.Scanner;
//Usar o operador logico &&
//Utilizar o Scanner
public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 11) {
            System.out.println(nome + " Participará da categoria Infantil");
        } else if (idade > 10 && idade < 16) {
            System.out.println(nome + " Participará da categoria Juvenil");
        } else if (idade > 15 && idade < 20) {
            System.out.println(nome + " Participará da categoria Pré Adulto");
        } else {
            System.out.println(nome + " Participará da categoria Adulto");
        }
    }
}
