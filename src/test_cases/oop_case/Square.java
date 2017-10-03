package test_cases.oop_case;

public class Square extends Shape {
    public Square(String color, double square) {
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
        return "Square{" +
                "color='" + color + '\'' +
                ", square=" + square +
                '}';
    }
}
