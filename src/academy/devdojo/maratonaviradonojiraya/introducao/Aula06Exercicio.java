package academy.devdojo.maratonaviradonojiraya.introducao;

public class Aula06Exercicio {
    public static void main(String[] args) {
        double carValue = 40000;

        for (int i = (int) carValue; i >= 1; i--) {
            double installmentValue = carValue / i;
            if (installmentValue < 1000) {
                continue;
            }
            System.out.println("Parcela " + i + " R$ " + installmentValue);
        }
    }
}
