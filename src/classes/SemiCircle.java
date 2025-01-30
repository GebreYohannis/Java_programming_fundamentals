package classes;

public final class SemiCircle extends Circle  {
    @Override
    public void draw() {
        System.out.println("Drawing rounded circle");
    }

    @Override
    public void makeHalf() {
        System.out.println("Rounded Circle");
    }
}
