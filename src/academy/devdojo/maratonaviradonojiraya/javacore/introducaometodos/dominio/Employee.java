package academy.devdojo.maratonaviradonojiraya.javacore.introducaometodos.dominio;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private int age;
    private BigDecimal[] wage;

    public void printEmployeeData() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        int i = 0;
        if (wage == null) return;
        for (BigDecimal salary :
                this.wage) {
            System.out.println("Salary[" + i + "]: " + salary);
            i++;
        }
        System.out.println("Average Salary: " + averageSalary(this.wage));
    }

    private BigDecimal averageSalary(BigDecimal... wage) {
        BigDecimal sumWage = BigDecimal.valueOf(0);
        BigDecimal average;
        if (wage == null) return sumWage;
        for (BigDecimal salary :
                this.wage) {
            sumWage = sumWage.add(salary);
        }
        average = sumWage.divideToIntegralValue(BigDecimal.valueOf(wage.length));
        return average;
    }

    public String getName() {return this.name;}
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {return this.age;}
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Please, enter a valid age!");
            return;
        }
        this.age = age;
    }

    public BigDecimal[] getWage() {return this.wage;}
    public void setWage(BigDecimal... wage) {this.wage = wage;}
}