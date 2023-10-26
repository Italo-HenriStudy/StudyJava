package academy.devdojo.maratonaviradonojiraya.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Using switch and given the values from 1 to 7. Print whether it is a business day or a weekend;
        // Considering 1 as Sunday;

        byte dayOfTheWeek = 0;
        String day;
        String result;

        switch (dayOfTheWeek) {
            case 1:
                day = "Sunday";
                result = "Weekend";
                break;
            case 2:
                day = "Monday";
                result = "Business Day";
                break;
            case 3:
                day = "Tuesday";
                result = "Business Day";
                break;
            case 4:
                day = "Wednesday";
                result = "Business Day";
                break;
            case 5:
                day = "Thursday";
                result = "Business Day";
                break;
            case 6:
                day = "Friday";
                result = "Business Day";
                break;
            case 7:
                day = "Saturday";
                result = "Weekend";
                break;
            default:
                day = "";
                result = "Invalid";
        }

        System.out.println(day + " is " + result);
    }
}
