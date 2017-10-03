import sun.security.provider.SHA;

/**
 * Created by user on 28.02.2016.
 */
public class Shape {

    int a;
    char b;
    Integer c;
    boolean checkedOut = true;

    public static int numberOfShapes;

    void draw() {
        System.out.println("Фигура отрисована");
    }

    static void doSmth(Shape shape) {
        shape.draw();
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut)
            System.out.println("Not finalized. Warning!");
    }


    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Circle shape2 = new Circle();
        Rectangle shape3 = new Rectangle();

        for (String arg : args)
            System.out.println(arg);

        shape1.a = 5;
        shape1.c = shape1.a;
        System.out.println(shape1.c);
//        Shape.numberOfShapes++;
        shape1.numberOfShapes++;
        System.out.println(Shape.numberOfShapes);
        shape2.numberOfShapes++;
        System.out.println(Shape.numberOfShapes);
        shape3.numberOfShapes++;
        System.out.println(Shape.numberOfShapes);
        shape1.numberOfShapes++;
        System.out.println(Shape.numberOfShapes);

//        System.getProperties().list(System.out);

        System.out.println(shape1.a);
        System.out.println(shape1.b);

        doSmth(shape1);
        doSmth(shape2);
        doSmth(shape3);

        shape2.checkIn();
        shape2 = null;

        shape3.checkIn();
        shape3 = null;

        shape1 = null;

        System.gc();



    }
}
