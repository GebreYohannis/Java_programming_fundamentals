package Expression;

public class ArithmeticExpression {
    public ArithmeticExpression() {
    }

    public void doOperation() {
        int addition = 12;
        System.out.println(addition);
        int multiplication = 860;
        System.out.println(multiplication);
        int subtraction = 10;
        System.out.println(subtraction);
        double division = 3.3333333333333335;
        System.out.println(division);
        int remainder = 1;
        System.out.println(remainder);
        int x = 10;
        int postIncrement = x++;
        System.out.println(postIncrement);
        ++x;
        int preIncrement = x;
        System.out.println(preIncrement);
        int postDecrement = x--;
        System.out.println(postDecrement);
        --x;
        int preDecrement = x;
        System.out.println(preDecrement);
    }
}
