package golovach.lesson4;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by user on 28.03.2016.
 */
public class Solution {
    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println(arg);
        }

        Node list = null;

        list = SingleLLUtils.genList(0, 1, 2, 3);

        System.out.println(SingleLLUtils.toString(list));

        System.out.println(SingleLLUtils.length(list));

        SingleLLUtils.add(list, 5);

        System.out.println(SingleLLUtils.toString(list));

        System.out.println(SingleLLUtils.length(list));

//        list = SingleLLUtils.insertInPosition(list, 2, 11);
        list = SingleLLUtils.insertInPosition(list, 2, 6);

        System.out.println(SingleLLUtils.toString(list));

        System.out.println(SingleLLUtils.max(list));

        System.out.println(SingleLLUtils.sum(list));

//        list = SingleLLUtils.remove(list);
//        System.out.println(SingleLLUtils.toString(list));
//        list = SingleLLUtils.remove(list);
//        System.out.println(SingleLLUtils.toString(list));
//        list = SingleLLUtils.remove(list);
//        System.out.println(SingleLLUtils.toString(list));

//        ArrayList

        System.out.println(SingleLLUtils.isGrowing(list, -1));

        System.out.println(new Date().getTime());

        System.out.println(System.currentTimeMillis());

    }
}
