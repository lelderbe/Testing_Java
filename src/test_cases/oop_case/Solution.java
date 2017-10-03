package test_cases.oop_case;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("blue", 15));
        shapes.add(new Square("yellow", 25));
        shapes.add(new Trap("black", 34));
        shapes.add(new Triangle("green", 20));
        // etc...

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

    }
}
