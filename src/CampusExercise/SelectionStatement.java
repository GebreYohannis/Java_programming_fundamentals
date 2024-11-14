package CampusExercise;

public class SelectionStatement {
    public static void doOperation() {
        int a = 10;
        if(a < 20)
            System.out.println("This is if statement");
        else
            System.out.println("This is else statement");

        int y = 30;
        if(y == 10)
            System.out.println("Value of y is 10");
        else if(y == 20)
            System.out.println("Value of y is 20");
        else if( y == 30)
            System.out.println("Value of y is 30");
        else
            System.out.println("This is else statement");
    }
}
