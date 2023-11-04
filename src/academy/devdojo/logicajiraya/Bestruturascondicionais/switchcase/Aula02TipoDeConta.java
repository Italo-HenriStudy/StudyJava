package academy.devdojo.logicajiraya.Bestruturascondicionais.switchcase;

import java.util.Scanner;

/*
 * Como gerente eu gostaria que meus usuários pudessem digitar o tipo da conta e o sistema imprima
 * qual a porcentagem de juros que aquela conta irá oferecer:
 * CONTA_POUPANCA 0.05%
 * CONTA_CORRENTE 0.02%
 * CONTA_INVESTIMENTO 0.1%
 * */
public class Aula02TipoDeConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para verificar os juros Digite um número correspondente as opções de conta abaixo:");
        System.out.println("[1] Conta Poupança");
        System.out.println("[2] Conta Corrente");
        System.out.println("[3] Conta Investimento");
        System.out.println("[0] Sair do Programa");
        int accountType = sc.nextInt();

        double jurosPoupanca = 0.05;
        double jurosCorrente = 0.02;
        double jurosInvestimento = 0.1;

        switch (accountType) {
            case 0:
                break;
            case 1:
                System.out.println("Juros da Conta Poupança: " + jurosPoupanca + "%");
                break;
            case 2:
                System.out.println("Juros da Conta Corrente: " + jurosCorrente + "%");
                break;
            case 3:
                System.out.println("Juros da Conta Poupança: " + jurosInvestimento + "%");
                break;
            default:
                System.out.println("Número Digitado Inválido");
        }
    }
}
