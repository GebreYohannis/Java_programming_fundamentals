package ControlFlow;

import java.util.Scanner;

public class Loops {
    public static void forLoop(int limits){
        for (int i = 0; i < limits; i++) {
            System.out.println(i);
        }

        for (int i = limits; i > 0 ; i--) {
            System.out.println(i);
        }
    }
    public static void whileLoop(){
        int counter = 5;
        while(counter > 0) {
            System.out.println(counter);
            counter--;
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("quite")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }

    public static void doWhileLoop(){
        int counter = 4;
        do {
            System.out.println("Executed at least once!");
            counter--;
        }while(counter >= 5);
    }

    public static void continueAndBreak() {
        var scanner = new Scanner(System.in);
        String input = "";
        while(true){
            System.out.print("Input: ");
            input = scanner.next();
            if(input.equalsIgnoreCase("pass"))
                continue;
            if(input.equalsIgnoreCase("quite"))
                break;
            System.out.println(input);
        }
    }

    public static void forEachLoop(){
        String[] fruits = { "Apple", "Mango","Lemon","Banana" };
        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
