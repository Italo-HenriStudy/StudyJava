package academy.devdojo.maratonaviradonojiraya.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 22;
        boolean isAuthorized = age > 20;

        // if compare the true value
        if (isAuthorized) {
            System.out.println("u can buy alcohol");
        } else {
            System.out.println("u can't buy");
        }
        // operator logical not = !
        if(!isAuthorized) {
            System.out.println("u can't buy alcohol");
        }

    }
}
