package academy.devdojo.maratonaviradonojiraya.javacore.introducaometodos.dominio;
import java.math.BigDecimal;

public class Employee {
    public String name;
    public int age;
    public BigDecimal[] wage;

    public void printEmployeeData() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        int i = 0;
        for (BigDecimal num :
                wage) {
            System.out.println("Salary[" + i + "]: " + num);
            i++;
        }
        System.out.println("Average Salary: " + averageSalary(this.wage));
    }
    public BigDecimal averageSalary(BigDecimal... wage) {
        BigDecimal sumWage = BigDecimal.valueOf(0);
        BigDecimal average;
        for (BigDecimal num :
                wage) {
            sumWage = sumWage.add(num);
        }
        average = sumWage.divideToIntegralValue(BigDecimal.valueOf(wage.length));
        return average;
    }
}