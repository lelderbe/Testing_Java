package test_cases.oop_case;

public abstract class Shape {
    protected String color;
    protected double square;

    public abstract void draw();

    public double getSquare() {
        return square;
    }

    public String getColor() {
        return color;
    }

    public Shape(String color, double square) {
        this.color = color;
        this.square = square;
    }

}
