package test_cases.oop_case;

public class Trap extends Shape {
    public Trap(String color, double square) {
        super(color, square);
    }

    @Override
    public void draw() {

    }

    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public String toString() {
        return "Trap{" +
                "color='" + color + '\'' +
                ", square=" + square +
                '}';
    }
}
