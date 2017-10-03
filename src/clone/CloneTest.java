package clone;

import java.util.Arrays;

/**
 * Created by user on 11.04.2017.
 */
public class CloneTest implements Cloneable {
    private int i;
    private String str;
    private Integer j;
    private int[] arr;

    public CloneTest() {
        this(-1, "xxx", -1, new int[]{0});
    }

    public CloneTest(int i, String str, Integer j, int[] arr) {
        this.i = i;
        this.str = str;
        this.j = j;
        this.arr = arr;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest c1 = new CloneTest(5, "abc", new Integer(13), new int[]{1, 2, 3});

        CloneTest c2 = (CloneTest) c1.clone();

        System.out.println(c2.i);
        System.out.println(c2.str);
        System.out.println(c2.j);
        System.out.println(Arrays.toString(c2.arr));
        System.out.println(c1.arr == c2.arr);

        c1.arr[0] = 11;
        c1.i = 999;
        System.out.println(c1.i);
        System.out.println(c2.i);
        System.out.println(Arrays.toString(c2.arr));

        B b = new B(4);
        B b2 = (B) b.clone();

        System.out.println("b2.value = " + b2.value);
        System.out.println("b2.i = " + ((CloneTest)b2).i);

    }
}

class B extends CloneTest {
    public int value;

    public B() {
    }

    public B(int value) {
        this.value = value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
