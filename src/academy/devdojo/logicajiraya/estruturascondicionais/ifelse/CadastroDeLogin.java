package academy.devdojo.logicajiraya.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome de usuário: ");
        String login = sc.next();

        if (login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador") || login.equals("") ) {
            System.out.println("Usuario Invalido");
        } else {
            System.out.println(login + " Cadastrado com sucesso!");
        }
    }
}
