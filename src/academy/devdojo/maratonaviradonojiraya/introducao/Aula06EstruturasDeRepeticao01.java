package academy.devdojo.maratonaviradonojiraya.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        // while only executes as long as the expression is true
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        // It will be executed at least once, even if the condition is true or false
        count = 0;
        do {
            System.out.println("dentro do do-while " + ++count);
        } while (count < 10);

        // for works with indexes
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //pair numbers from 1 to 100
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // prints 25 numbers after variable number
        int number = 15;
        for (int i = 0; i <= 25; i++) {
            System.out.println(number++ + " " + i);
        }

    }
}