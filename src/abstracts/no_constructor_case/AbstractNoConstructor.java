package abstracts.no_constructor_case;

/**
 * Created by user on 06.05.2017.
 */
public class AbstractNoConstructor {
    public static void main(String[] args) {

    }

    static abstract class AbstractClass {
        void draw() {
            System.out.println("AbstractClass");
        }

        public AbstractClass() {

        }

        public AbstractClass(int i) {
        }
    }

    static class SubClass extends AbstractClass {
        @Override
        void draw() {
            System.out.println("SubClass");
        }

        public SubClass() {
        }

        public SubClass(int i) {
            super(i);
        }
    }
}
