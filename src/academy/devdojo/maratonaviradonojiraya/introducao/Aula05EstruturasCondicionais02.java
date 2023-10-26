package academy.devdojo.maratonaviradonojiraya.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // age < 15 = children's
        // age >= 15 && age < 18 = juvenile
        // age >= 18 = adult

        Scanner sc = new Scanner(System.in);
        int  age;
        String category;

        System.out.print("Type your age: ");
        age = sc.nextInt();

        if (age < 15) {
            category = "Your category is Children's";
        } else if (age < 18) {
            category = "Your category is Juvenile";
        } else {
            category = "Your category is adult";
        }
        System.out.println(category);
    }
}
