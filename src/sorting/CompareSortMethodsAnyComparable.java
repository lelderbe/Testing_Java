package sorting;

import sorting.methods_comparable.AbstractSortComparable;
import sorting.methods_comparable.SelectionSortComparable;
import sorting.utils.SortMetrics;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by user on 29.01.2017.
 *
 *
 *
 *
 */
public class CompareSortMethodsAnyComparable {
    public static final int ARRAY_SIZE = 10;
    public static final int ARRAY_ELEMENTS_SIZE = 10000; //Integer.MAX_VALUE;

    private static Integer[] original = generateRandomArray(ARRAY_SIZE);
//    private static int[] original = generateASCArray(ARRAY_SIZE);
//    private static int[] original = generateDESCArray(ARRAY_SIZE);


    public static void main(String[] args) throws InterruptedException {

        doSort("Selection sort", getCopyArray(), new SelectionSortComparable());
//        doSort("Insertion sort", getCopyArray(), new InsertionSort());
//        doSort("Bubble sort", getCopyArray(), new BubbleSort());
//        doSort("My Merge sort", getCopyArray(), new MyMergeSort());

    }

    public static Integer[] getCopyArray() {
        Integer[] copy = new Integer[ARRAY_SIZE];
        System.arraycopy(original, 0, copy, 0, ARRAY_SIZE);
        return copy;
    }

    public static void doSort(String name, Integer[] array, AbstractSortComparable method) {
        Date startTime, stopTime;

        System.out.print(ARRAY_SIZE <= 100 ? Arrays.toString(array) + "\n" : "");

        startTime = new Date();           //получаем текущую дату и время
        SortMetrics metrics = method.sort(array);
        stopTime = new Date();

        System.out.print(ARRAY_SIZE <= 100 ? Arrays.toString(array) + "\n" : "");
        System.out.printf("%-20s Time elapsed: %10dms, %s\n", name, (stopTime.getTime() - startTime.getTime()), metrics);
    }


    public static Integer[] generateRandomArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.round((float) Math.random() * ARRAY_ELEMENTS_SIZE);
        }

        return array;
    }

    public static int[] generateASCArray(int size) {
        int randomSeed = Math.round((float) Math.random() * (Integer.MAX_VALUE - ARRAY_ELEMENTS_SIZE));
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + randomSeed;
        }

        return array;
    }

    public static int[] generateDESCArray(int size) {
        int randomSeed = Math.round((float) Math.random() * (Integer.MAX_VALUE - ARRAY_ELEMENTS_SIZE));
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = randomSeed - i;
        }

        return array;
    }

}
