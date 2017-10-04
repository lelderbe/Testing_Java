package arrays;

/**
 * Created by user on 20.02.2017.
 */
public class ArrayInit {
    public static void main(String[] args) {
        int a[] = new int[5];

        int[] arr = {1, 2, 3};
        arr = new int[] {2, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
