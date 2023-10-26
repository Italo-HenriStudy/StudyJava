package academy.devdojo.maratonaviradonojiraya.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Print days of the week, considering 1 as sunday.

        byte dayOfTheWeek = 3;
        String printDay;

        // the switch only accepts variables of the type:
        // byte, short, char, enum, int, String
        switch (dayOfTheWeek) {
            case 1:
                printDay = "Sunday";
                break;
            case 2:
                printDay = "Monday";
                break;
            case 3:
                printDay = "Tuesday";
                break;
            case 4:
                printDay = "Wednesday";
                break;
            case 5:
                printDay = "Thursday";
                break;
            case 6:
                printDay = "Friday";
                break;
            case 7:
                printDay = "Saturday";
                break;
            default:
                printDay = "Number Invalid";
        }

        System.out.println(printDay);
    }
}
