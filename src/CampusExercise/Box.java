package CampusExercise;

public class Box {
    private double width;
    private double length;
    private double height;

    public Box(double width,double height) {
        this.width =  width;
        this.height = height;
    }

    public Box(double width, double height, double length) {
        this(width, height);
        this.length = length;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width *  height;
    }

    public double getVolume() {
        return width * height * length;
    }
}
