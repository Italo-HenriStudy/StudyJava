package academy.devdojo.logicajiraya.Clacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "naruto";
        String senha = "123";

        while (true){
            System.out.print("Digite o login: ");
            String logar = sc.next();

            System.out.print("Digite sua senha: ");
            String pass = sc.next();

            if (logar.equals(login) && pass.equals(senha)){
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
                System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA ENCERRADO");
    }
}
