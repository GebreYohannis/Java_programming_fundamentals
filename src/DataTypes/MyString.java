package DataTypes;

public class MyString {
    public MyString() {
    }

    public void doOperation() {
        String message = "Hello World";
        System.out.println(message);
        int stringLength = message.length();
        System.out.println("String length: " + stringLength);
        boolean endsWith = message.endsWith("d");
        System.out.println("EndsWith: " + endsWith);
        boolean startsWith = message.startsWith("!!");
        int index = message.indexOf("H");
        String replacedString = message.replace("H", "J");
        System.out.println(replacedString);
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        String name = "Hello \"Demis\"";
        System.out.println(name);
        String path = "C:\\Users\\demis\\IdeaProjects\\Java_Basics";
        System.out.println(path);
        String addNewLine = "Hello\nWorld";
        System.out.println(addNewLine);
        String tab = "Hello \t World";
        System.out.println(tab);
    }
}
