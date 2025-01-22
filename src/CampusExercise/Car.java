package CampusExercise;

public class Car {

    Engine engine = new Engine();
    Light carLight = new Light("Green", true);
    private boolean isMoving = false;

    public void start() {
        isMoving = true;
    }

    public void stop() {
        isMoving = false;
    }

    public void move() {
        engine.setDeviceEngine("Car engine");
        System.out.println( isMoving ? "Car is running..." : "Car is not running...");
    }
}
