package CampusExercise;

public class LocalVariables {
    public static void showLocals(){
        int local = 1;
        System.out.println("Local: " + local);

        int anotherLocal;
        // Variable anotherLocal might not have been initialized
        //System.out.println("AnotherLocal: " + anotherLocal); // Error

        // As a rule of thumb you have to initialize all or your local variables
        // Local variable cannot be static like you do in c++ meaning it is not allowed in java
        // static int local ; // Error: static is not allowed here

    }
}
