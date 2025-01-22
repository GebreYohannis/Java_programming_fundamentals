package CampusExercise.LabExrciseTwo;

import java.util.Scanner;

class CalAge {
    private int birthDay, birthMonth, birthYear;
    private int currentDay, currentMonth, currentYear;

    private boolean isLeapYear(int year) {
        return (((year % 4 == 0 )&&
                (year % 100 != 0)) ||
                (year % 400 == 0)
        );
    }

    private int daysInMonth(int month, int year) {
        if (month == 2) return isLeapYear(year) ? 29 : 28;
        return (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
    }

    private boolean isValidDate(int day, int month, int year) {
        return ( year >= 0 &&
                (month >= 1 && month <= 12) &&
                (day >= 1 && day <= daysInMonth(month, year))
        );
    }

    public void setDateOfBirth(int day, int month, int year) {
        if (!isValidDate(day, month, year))
            throw new IllegalArgumentException("Invalid date of birth!");

        birthDay = day;
        birthMonth = month;
        birthYear = year;
    }

    public void setCurrentDate(int day, int month, int year) {
        if (!isValidDate(day, month, year))
            throw new IllegalArgumentException("Invalid current date!");

        currentDay = day;
        currentMonth = month;
        currentYear = year;
    }

    public double calculateAge() {
        int ageYears = currentYear - birthYear;
        int ageMonths = currentMonth - birthMonth;
        int ageDays = currentDay - birthDay;
        if (ageDays < 0) {
            ageMonths--;
            ageDays += daysInMonth(birthMonth, birthYear);
        }
        if (ageMonths < 0) {
            ageYears--;
            ageMonths += 12;
        }
        double age = ageYears + ageMonths / 12.0;
        return Math.floor(age * 10) / 10.0; // Round to one decimal place
    }
}

public class CalculatePersonAge {
    public static void calculate() {
        try {
            Scanner scanner = new Scanner(System.in);

            CalAge person = new CalAge();

            System.out.print("Birth Day: ");
            int birthDay = scanner.nextInt();

            System.out.print("Birth Month: ");
            int birthMonth = scanner.nextInt();

            System.out.print("Birth Year: ");
            int birthYear = scanner.nextInt();

            System.out.print("Current Day: ");
            int currentDay = scanner.nextInt();

            System.out.print("Current Month: ");
            int currentMonth = scanner.nextInt();

            System.out.print("Current Year: ");
            int currentYear = scanner.nextInt();

            person.setDateOfBirth(birthDay, birthMonth, birthYear); // Example: 15th May 1995
            person.setCurrentDate(currentDay, currentMonth, currentYear); // Example: 26th November 2024

            double age = person.calculateAge();
            System.out.println("The age is: " + age + " years");
            scanner.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
