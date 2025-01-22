package CampusExercise.LabExrciseTwo;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class CalculateAge {
    private int birthDay, birthMonth, birthYear;
    private int currentDay, currentMonth, currentYear;

    public CalculateAge() {
    }


    public CalculateAge(int birthYear,int birthDay, int birthMonth) {
        GregorianCalendar calendar = new GregorianCalendar();
        this.birthYear = birthYear;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.currentYear = calendar.getWeekYear();
        this.currentDay = calendar.getFirstDayOfWeek();
        System.out.println("Current Dat: " + currentDay);
        int weeksInYear = calendar.getWeeksInWeekYear();
        System.out.println("Weeks in year: " + weeksInYear);
    }


    public double getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double calculateAge() {
        if(currentYear < birthYear)
            throw new IllegalArgumentException("Invalid birth year!");
        return currentYear - birthYear;
    }

    public static void displayResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Birth day: ");
        int birthDay = scanner.nextInt();

        System.out.print("Birth Month: ");
        int birthMonth = scanner.nextInt();
        CalculateAge calculate = new CalculateAge(birthYear,birthDay, birthMonth);
        calculate.setBirthYear(birthYear);
        double calculatedAge = calculate.calculateAge();
        System.out.println("Age: " + calculatedAge);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }
}
