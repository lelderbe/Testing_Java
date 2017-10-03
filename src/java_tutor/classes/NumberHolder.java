package java_tutor.classes;

/**
 * Created by user on 07.04.2017.
 */
public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        System.out.println(numberHolder.anInt = 5);
        System.out.println(numberHolder.aFloat = 5.0f);

    }
}