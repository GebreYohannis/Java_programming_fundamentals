package classes;

public sealed class Circle extends Shape permits SemiCircle,SegmentCircle {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    public void makeHalf() {
        System.out.println("Make round");
    }
}