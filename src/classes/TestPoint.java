package classes;

public class TestPoint {
    public void doTest(){
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point1));
        System.out.println(point1 == point2);
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }
}
