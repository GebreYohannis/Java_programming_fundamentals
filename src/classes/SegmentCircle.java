package classes;

public non-sealed class SegmentCircle extends Circle {
    @Override
    public void draw() {
        System.out.println("Drawing a segment circle");
    }

    @Override
    public void makeHalf() {
        System.out.println("Make a segment half");
    }

    public double getSegmentArea() {
        return 0;
    }
}


class DividableSegment extends SegmentCircle {

}