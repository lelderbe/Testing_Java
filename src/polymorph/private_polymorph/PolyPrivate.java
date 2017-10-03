package polymorph.private_polymorph;

/**
 * Created by user on 06.05.2017.
 */
public class PolyPrivate {
    public static void main(String[] args) {
//        SuperClass obj = new SuperClass();
//        SubClass obj = new SubClass();
        SuperClass obj = new SubClass();
        obj.draw();
    }

    static class SuperClass {
        /*private*/ void draw() {
            System.out.println("SuperClass.draw()");
        }
    }

    static class SubClass extends SuperClass {
        void draw() {
            System.out.println("SubClass.draw()");
        }
    }

}
