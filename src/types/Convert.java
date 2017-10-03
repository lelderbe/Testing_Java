package types;

/**
 * Created by user on 17.02.2017.
 */
public class Convert {
    public static void main(String[] args) {
//        byte a = 1;
//        byte b = 2;
//        byte c = (byte) (a + b);
//
//        int x=0;
////        System.out.println(x==x++);
////        System.out.println(x++==x++);
////        System.out.println(++x==x);
////        System.out.println(++x==++x);
//        System.out.println(x++==++x);
//
//        int a = 5;
//        int b = 6;
////        ++a = b++;
//        System.out.println(a);


        long a = 111111111111L;
        float f = a;
        long b = 11111L;
        float d = b;
        System.out.println( a == (long) f);
        System.out.println( b == (long) d);
    }

}
