package lambdas;

public class LambdasDemo {
    private static String staticFiled = "{Some static filed}";
    private String instanceFiled = "{Some instanceFiled}";
    public static void show() {
        // new Instance of a class that implements the Printer interface
        greet(new ConsolePrinter());

        // Anonymous Inner class
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });

        // Lambdas: ((->)lambda operator)
        Printer printer = (String message) -> System.out.println(message);
        greet(printer);

        // Or
        greet((String message)-> {
            System.out.println(message);
        });

        // Even, we can make this code better
        greet(message -> System.out.println(message));
        // Variable capture
        String prefix = "-";
        greet(message -> System.out.println(prefix + message));
        // Capture static filed inside lambdas expression
        greet(message -> System.out.println(staticFiled + message));

        // Capture instance filed inside lambdas expression
   }

   public void accessInstanceFiledInsideLambdas() {
        greet(message -> System.out.println(instanceFiled + message));
   }

   public void theThisKeyWord() {
        // Inside lambdas expression the keyword {this} refers the current instance of the
       // class enclosing it(in this case the LambdasDemo class)
       // In lambdas expression we cannot have filed because it represents anonymous function
        greet(message -> System.out.println(this));

        // Whereas the keyword {this} inside an anonymous class it refers the current instance of the anonymous class itself
       // also anonymous class can have a state(instance filed)
        greet(new Printer() {
            private String filed;
            @Override
            public void print(String message) {
                System.out.println(this);
            }
        });
   }
   public void methodReference() {
        // to reference a method use the following syntax
       // Class/Object::methodDefinedByTheInstanceObjectClassWithoutParenthesis
       greet(System.out::println);// Method reference

       // For static method
       greet(message -> staticMethodToBeReferenced(message)); // Or
       greet(LambdasDemo::staticMethodToBeReferenced);

       // For instance method
       var demo = new LambdasDemo();
       greet(message -> demo.instanceMethodToBeReferenced(message)); // Or
       greet(demo::instanceMethodToBeReferenced);
   }

   public static void staticMethodToBeReferenced(String message){}
    public void instanceMethodToBeReferenced(String message){}
    public static void greet(Printer printer){
        printer.print("Hello world");
    }

    private class LambdasPassingAValueWithConstractor{
        LambdasPassingAValueWithConstractor(String message){

        }
        public void show(){
            // Passing a value to the constructor
            greet(message -> new LambdasPassingAValueWithConstractor(message)); // Or
            greet(LambdasPassingAValueWithConstractor::new);
        }
    }
}
