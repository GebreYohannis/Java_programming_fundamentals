package CampusExercise;

public class StringMethods {
    public static void doOperation() {
        String text = "I love Java and Java loves me";
        int indexOfJ = text.indexOf('J');
        int indexOfLove = text.indexOf("Love");
        int indexOfOve = text.indexOf("ove");

        String textOne = "John";
        String textTwo = "Java";
        String textThree = textOne + textTwo; // JohnJava
        String textFour = textOne + " " + textTwo; // John Java
        String name = "John";
        String greeting = "How are You " + name + "? ++++++++ How are You John ";

    }
}
