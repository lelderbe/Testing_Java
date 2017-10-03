package compile_time_constant;

/**
 * Created by user on 06.04.2017.
 */
public class ClassA {

    private Double pi;
    private String text;

    public void sayPI() {
        System.out.println(text + " / " + pi);
    }

    public ClassA() {
        pi = Solution.PI;
        text = Solution.TEXT;
    }
}
