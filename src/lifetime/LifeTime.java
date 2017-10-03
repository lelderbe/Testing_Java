package lifetime;

/**
 * Created by user on 19.12.2016.
 */
public class LifeTime {
    private int a = 3;

    public static void main(String[] args) {
        LifeTime l1 = new LifeTime();
        LifeTime l2 = new LifeTime();

        System.out.println(l1.getA());
        System.out.println(l2.getA());

        l2.change(l1);

        System.out.println(l1.getA());
    }

    public void change(LifeTime obj) {
        obj.a = 7;
    }

    public int getA() {
        return a;
    }

}
