package classes;

public class Employee {
    /*
    *** Encapsulation Principle ***:
    Bundle the data and methods that operate on the data in a single unit.

   *** Abstraction Principle ***:
   *  Reduce complexity by hiding unnecessary details

    *** Coupling ***:
    * Tells the level of dependency between classes
    * It tell how much the one class is dependent up on another class

    */
    public int numberOfEmployees;
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary){
        setBaseSalary(baseSalary);
        numberOfEmployees++;
    }

    public Employee(int baseSalary, int hourlyRate) {
        this(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    

    public void setBaseSalary(int baseSalary) {
        if(baseSalary < 0)
            throw new IllegalArgumentException("Salary cannot be zero or less!");
        this.baseSalary = baseSalary;
    }

    public int gerBaseSalary() {
        return getBaseSalary();
    }

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or less!");
    }
    public int calculateWage(int extraHours) {
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
