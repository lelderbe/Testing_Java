package map;

import java.util.LinkedHashMap;

public class Solution {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        Integer i = new Integer(1);
        map.put("abc", i);
        map.put("abc", i);

        System.out.println(map);

        System.out.println(map.containsValue(i));


    }
}
