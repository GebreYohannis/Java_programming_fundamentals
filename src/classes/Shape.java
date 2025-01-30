package classes;

public sealed abstract class Shape permits Circle, Rectangle, Square {
    public abstract void draw();
}
