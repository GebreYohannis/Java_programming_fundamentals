package CampusExercise;

public class SwitchStatement {
    public static void doOperation() {
        char letterGrade = 'C';
        switch (letterGrade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            case 'C':
                System.out.println("You passed!");
                break;
            case 'D':
                System.out.println("You failed!");
                break;
            case 'F':
                System.out.println("It's better you try again!");
                break;
            default:
                System.out.println("Invalid grade!");
                break;
        }
    }
}
