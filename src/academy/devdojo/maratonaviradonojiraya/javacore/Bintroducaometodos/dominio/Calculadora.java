package academy.devdojo.maratonaviradonojiraya.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(1 + 1);
    }

    public void subtraiDoisNumeros() { System.out.println(21 - 7); }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }
    
    public double divideDoisNumeros(double num1, double num2) {
        double result = num1 / num2;
        if (num1 == 0 || num2 == 0) {
            result = 0;
        }
        return result;
    }

    public void imprimeDivisao(double num1, double num2) {
        double result = num1 == 0 || num2 == 0 ? 0 : num1 / num2;
        if (result == 0) {
            System.out.println("Não existe divisão por 0");
        } else {
            System.out.println(result);
        }
    }
}
