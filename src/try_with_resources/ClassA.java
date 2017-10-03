package try_with_resources;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by user on 11.04.2017.
 */
public class ClassA {
    public static void main(String[] args) {

        try(ClassB b = new ClassB()) {
            System.out.println("In try block");
//            throw new IOException("test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class ClassB implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("Closed!");
        }
    }
}
