package CampusExercise.LabExrciseTwo;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class CalculateAge {
    private double birthYear;
    private int currentYear;

    public CalculateAge(double birthYear) {
        this.birthYear = birthYear;
        this.currentYear = (new GregorianCalendar()).getWeekYear();
    }


    public double getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(double birthYear) {
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
        Double birthYear = scanner.nextDouble();

        String stringBirthYearValue = birthYear.toString();
        String[] values = stringBirthYearValue.split(".");
        String newValues = Arrays.toString(values);
        System.out.println(newValues);
        System.out.println("BirthYear: " + stringBirthYearValue);

        CalculateAge calculate = new CalculateAge(birthYear);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        var weekYear = gregorianCalendar.getWeekYear();
        System.out.println("Week Year: " + calculate.getCurrentYear());
        var dateZone = gregorianCalendar.toZonedDateTime();
        var year = dateZone.getYear();
        var month = dateZone.getMonth();
        var dayOfMonth = dateZone.getDayOfMonth();
        System.out.println("year: " + year + ", month: " + month + ", Day: " + dayOfMonth);

        System.out.println("You are " + calculate.calculateAge()+ " years old.");
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }
}
