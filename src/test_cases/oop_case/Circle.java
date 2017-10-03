package test_cases.oop_case;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double square) {
        super(color, square);
    }

    @Override
    public void draw() {

    }

    @Override
    public double getSquare() {
        return 0;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", square=" + square +
                '}';
    }
}
