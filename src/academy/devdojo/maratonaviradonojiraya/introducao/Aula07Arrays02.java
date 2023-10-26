package academy.devdojo.maratonaviradonojiraya.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // standard values:
        // byte, short, int, long, int e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        int[] test = new int[1];
        System.out.println(test[0]);

        String[] names = new String[3];
        names[0] = "Goku";
        names[1] = "Naruto";
        names[2] = "Luffy";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
