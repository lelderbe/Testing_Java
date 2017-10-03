package test_cases.oop_case;

public class Triangle extends Shape {
    private double hypo;

    public Triangle(String color, double square) {
        super(color, square);
    }

    @Override
    public void draw() {

    }

    @Override
    public double getSquare() {
        return 0;
    }

    public double getHypo() {
        return hypo;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + color + '\'' +
                ", square=" + square +
                '}';
    }
}
