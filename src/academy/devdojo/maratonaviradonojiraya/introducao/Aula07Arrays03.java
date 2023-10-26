package academy.devdojo.maratonaviradonojiraya.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // initializing an array
        int[] numbers1 = new int[0];
        int[] numbers2 = {1,2,3,4};
        int[] numbers3 = new int[]{1,2,3,4};

        // foreach
        for (int i:numbers3){
            System.out.println(i);
        }
    }
}
