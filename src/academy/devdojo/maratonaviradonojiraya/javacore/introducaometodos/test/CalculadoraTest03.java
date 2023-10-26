package academy.devdojo.maratonaviradonojiraya.javacore.introducaometodos.test;

import academy.devdojo.maratonaviradonojiraya.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.divideDoisNumeros(0, 10));

        calculadora.imprimeDivisao(10, 0);
    }
}