package academy.devdojo.maratonaviradonojiraya.javacore.introducaometodos.test;
import academy.devdojo.maratonaviradonojiraya.javacore.introducaometodos.dominio.Employee;
import java.math.BigDecimal;
import java.util.Arrays;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("João Pé de Feijão");
        employee.setAge(30);
        employee.setWage(BigDecimal.valueOf(5000.0), BigDecimal.valueOf(3500.0), BigDecimal.valueOf(2500.0));

//        employee.printEmployeeData();
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(Arrays.toString(employee.getWage()));
    }
}