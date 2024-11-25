package CampusExercise.LabExrciseTwo;

import java.util.Scanner;

class CalAge {
    private int birthDay, birthMonth, birthYear;
    private int currentDay, currentMonth, currentYear;

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private int daysInMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        return 31;
    }

    private boolean isValidDate(int day, int month, int year) {
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > daysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    public void setDateOfBirth(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            birthDay = day;
            birthMonth = month;
            birthYear = year;
        } else {
            System.out.println("Invalid date of birth.");
        }
    }

    public void setCurrentDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            currentDay = day;
            currentMonth = month;
            currentYear = year;
        } else {
            System.out.println("Invalid current date.");
        }
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
        CalAge person = new CalAge();
        person.setDateOfBirth(15, 5, 1995); // Example: 15th May 1995
        person.setCurrentDate(26, 11, 2024); // Example: 26th November 2024

        double age = person.calculateAge();
        System.out.println("The age is: " + age + " years");
    }
}
