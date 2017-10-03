package reflection;

import java.lang.reflect.Field;

/**
 * Created by user on 11.04.2017.
 */
public class Solution {
    private int intValue = 5;

    public static void main(String[] args) {
        System.out.println("123".getClass());
        System.out.println(int.class.getClass());
        System.out.println(Integer.class.getClass());
        System.out.println(new Integer(5).getClass());

        Class c = int.class.getClass();
        System.out.println(c.getName());

        Field[] fields = new Solution().getClass().getDeclaredFields();
        System.out.println(new Solution().getClass().getSuperclass());

        System.out.println(fields.length);

        for (Field field : fields) {
            System.out.println(field.getType());
            System.out.println(field.getName());
        }

    }
}
