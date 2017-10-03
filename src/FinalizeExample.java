import java.util.Arrays;
import testing.*;

/**
 * Created by user on 06.03.2016.
 */
public class FinalizeExample {

    boolean checkedOut = true;

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut)
            System.out.println("Not finalized. Warning!");
        else
            System.out.println("Finalized. Good job!");
    }

    public static void main(String[] args) {

        VariableLengthArgs varargs = new VariableLengthArgs();
        varargs.print(99, 0, 1, 2, 3, 4, 5);

//        int[] arr = new int[]{4, 2, 0, -10, 7};
        Integer[] arr = new Integer[]{new Integer(4), new Integer(2), new Integer(0), new Integer(-10), new Integer(7)};

        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));

        FinalizeExample test1 = new FinalizeExample();
        FinalizeExample test2 = new FinalizeExample();
        FinalizeExample test3 = new FinalizeExample();

        test1.checkIn();
        test1 = null;

        test2.checkIn();
        test2 = null;

        test3 = null;

        System.gc();



    }

}


