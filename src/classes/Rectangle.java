package classes;

public sealed class Rectangle extends Shape permits RoundedRectangle {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}


