package equals;

import java.util.HashSet;

/**
 * Created by user on 11.04.2017.
 */
public class HashCodeTest {
    public static void main(String[] args) {
        Class1 c1 = new Class1(2, 3);
        Class1 c2 = new Class1(4, 6);

        // Не зависимо от реализации hashcode получим сравнение по equals:
        System.out.println(c1.equals(c2));

        // Коллекции сначала сравнивают hashcode. Если он не совпадёт - до equals дело даже не дойдёт.
        HashSet<Class1> set = new HashSet<>();
        set.add(c1);
        System.out.println(set.contains(c2));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}

class Class1 {
    int a;
    int b;

    public Class1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        return a / b;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Class1 other = (Class1) obj;

        return this.a * other.b == this.b * other.a;

    }
}
