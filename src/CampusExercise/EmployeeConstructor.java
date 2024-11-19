package CampusExercise;

import java.text.NumberFormat;

public class EmployeeConstructor {
    private String name;
    private double salary;

    public EmployeeConstructor(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

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

    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + NumberFormat.getCurrencyInstance().format(this.salary
        ));
    }
}
