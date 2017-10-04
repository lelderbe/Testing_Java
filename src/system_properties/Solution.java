package system_properties;

import java.util.Properties;

/**
 * Чтение переменных среды (системы)
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));
//        System.out.println(System.getProperties());

        for (String name : System.getProperties().stringPropertyNames()) {
            System.out.println(name + " = " + System.getProperty(name));
        }

    }
}
