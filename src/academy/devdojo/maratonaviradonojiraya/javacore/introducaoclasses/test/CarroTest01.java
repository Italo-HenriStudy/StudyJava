package academy.devdojo.maratonaviradonojiraya.javacore.introducaoclasses.test;

import academy.devdojo.maratonaviradonojiraya.javacore.introducaoclasses.dominio.Carro;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do carro: ");
        carro1.nome = sc.next();

        System.out.print("Insira o Modelo do Carro: ");
        carro1.modelo = sc.next();

        System.out.print("Insira o ano de fabricação: ");
        carro1.ano = sc.nextInt();

        carro2.nome = "Uno";
        carro2.modelo = "Fiat";
        carro2.ano = 2005;

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

    }
}
