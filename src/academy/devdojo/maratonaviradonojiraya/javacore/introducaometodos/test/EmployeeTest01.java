package academy.devdojo.maratonaviradonojiraya.javacore.introducaometodos.test;
import academy.devdojo.maratonaviradonojiraya.javacore.introducaometodos.dominio.Employee;
import java.math.BigDecimal;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "GuiZika Gamesplay";
        employee.age = 20;
        employee.wage = new BigDecimal[]{BigDecimal.valueOf(5000.0), BigDecimal.valueOf(3500.0), BigDecimal.valueOf(2500.0)};

        employee.printEmployeeData();

    }
}