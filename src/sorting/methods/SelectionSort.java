package sorting.methods;

/**
 * Created by user on 29.01.2017.
 */
public class SelectionSort extends AbstractSort {
//    public static void main(String[] args) {
//        int[] array = CompareSortMethods.generateRandomArray(15);
//        System.out.println(Arrays.toString(array));
//        new SelectionSort().doSort();
//        System.out.println(Arrays.toString(array));
//
//    }

    @Override
    public void doSort() {
        int arrayLength = getArrayLength();

        for (int i = 0; i < arrayLength - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (compare(j, minPosition) == -1) { // array[j] < array[minPosition]
                    minPosition = j;
                }
            }
//            if (i != minPosition) {
                swap(i, minPosition);
//            }
        }

    }


}
