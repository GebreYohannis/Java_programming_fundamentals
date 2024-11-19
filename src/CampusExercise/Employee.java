package CampusExercise;

import java.text.NumberFormat;

public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showResult() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + NumberFormat.getCurrencyInstance().format(salary));
    }
}
