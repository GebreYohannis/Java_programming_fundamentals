package CampusExercise;

public class InstanceVariables {

    // Note: Instance variables have default value
    // e.g Boolean => false
    // Number => 0
    // Object => null
    public String name; //Accessible globally
    private int privateInstance; // Accessible only with the class
    protected double protectedInstance; // Accessible with the class and subclass also the same package nothing more
    long defaultInstance; // Accessible with in the class and the same package nothing more
    public InstanceVariables(String name){
        this.name = name;
    }
    public static void doOperation(){
        // Calling instance variable (accessing instance
        // variable) is not allowed inside static methods meaning
        // you have to create or instantiate object
        // of the class to access them
        // System.out.println("Hello your name is "+ this.name); // Error! cannot reference from static context
        //System.out.println("Hello your name is "+ name); // Error! cannot reference from static context

        // showName(); // Non-static method (showName()) cannot be referenced from a static context.

        // The following codes are possible but not the above
        InstanceVariables instanceVariables = new InstanceVariables("Demis");
        instanceVariables.name = "Abebe";
        instanceVariables.showName();

        System.out.println("Private Instance: " + instanceVariables.privateInstance); // Private Instance: 0
        System.out.println("Protected Instance: " + instanceVariables.protectedInstance); // Protected Instance: 0.0

        System.out.println("Default Instance: " + instanceVariables.protectedInstance); // Default Instance: 0
    }

    public void showName() {
        System.out.println("Hello your name is " + this.name);
        System.out.println("Hello your name is " + name); // Another option
    }
}

class TestInstanceVariables {
    public void test() {
        InstanceVariables instanceVariables = new InstanceVariables("Demis");
        instanceVariables.name = "Alex";
        instanceVariables.protectedInstance = 12.2;
        instanceVariables.defaultInstance = 12;
        // instanceVariables.privateInstance = 1; // Error
        instanceVariables.showName();
    }
}