package temp;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;

/**
 * Created by user on 24.05.2016.
 */
public class Example {
    public static void main(String[] args) {


        Shape shape = new Shape();
        shape.draw();

        Circle circle = new Circle();
        circle.draw();
    }
}

class Shape {
    public void draw() {
        System.out.println("I'm a shape");
    }
}

class Circle extends Shape{
    public void draw() {
        super.draw();
        System.out.println("But I'm a circle too!!");
    }
}


