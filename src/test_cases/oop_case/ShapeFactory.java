package test_cases.oop_case;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<Integer, Shape> shapes = new HashMap<>();

    static {
//        shapes.put(new Integer(0), new Circle())
    }

    public static Shape getShape() {
        return null;
    }
}
