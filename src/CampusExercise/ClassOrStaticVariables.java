package CampusExercise;

public class ClassOrStaticVariables {

    public static String configurationName;
    private static String privateStaticVariable;
    protected static double protectedStaticVariable;
    static boolean defaultStaticVariable;

    private static int objectCount;

    public static void setObjectCount(int objectCount){
        ClassOrStaticVariables.objectCount = objectCount;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public ClassOrStaticVariables(){
        objectCount++;
    }

    public static void showStaticVariables(){
        System.out.println("Config Name: " + configurationName); // Ok
    }

    public void doWork() {
        System.out.println("Config Name: " + configurationName); // ok
    }

    public static void doOperation() {
        TestStaticVariables.test();
    }
}

class TestStaticVariables  {
    public static void test()  {
        ClassOrStaticVariables staticVariables = new ClassOrStaticVariables();

        staticVariables.doWork(); // ok

        // Static variables are only belongs to the class and each
        // instance of the class has only one instance variables
        // staticVariables.showStaticVariables(); // Not ok:

        ClassOrStaticVariables.defaultStaticVariable = false;
        ClassOrStaticVariables.protectedStaticVariable = 9;
        ClassOrStaticVariables.configurationName = "Node windows configuration";
        // ClassOrStaticVariables.privateStaticVariable; // Not ok

        ClassOrStaticVariables classVariables = new ClassOrStaticVariables();

        classVariables.doWork();
        var objectCount = ClassOrStaticVariables.getObjectCount();
        System.out.println("Object count: " + objectCount);
    }
}