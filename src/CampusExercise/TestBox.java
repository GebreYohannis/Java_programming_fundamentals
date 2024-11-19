package CampusExercise;

public class TestBox {
    private double area;
    private double volume;
    public void test() {
        Box box1 = new Box(12,13);
        this.area = box1.getArea();

        Box  box2 = new Box(12,34,45);
        this.volume = box2.getVolume();
    }
    public void showResult() {
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
}
