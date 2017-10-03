package sorting;

import sorting.methods.*;
import sorting.utils.SortMetrics;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by user on 29.01.2017.
 *
 *
 *
 Some results (50k elements):

 RANDOM:
 Selection sort       Time elapsed:       3869ms,        1 249 975 000 compares,               49 985 swaps,        2 500 049 970 reads,               99 970 writes
 Insertion sort       Time elapsed:       2893ms,          621 321 494 compares,          621 271 506 swaps,        2 485 186 000 reads,        1 242 543 012 writes
 Bubble sort          Time elapsed:       9085ms,        1 249 975 000 compares,          621 271 506 swaps,        3 742 493 012 reads,        1 242 543 012 writes
 My Merge sort        Time elapsed:         19ms,              718 260 compares,                    0 swaps,            2 220 984 reads,              784 464 writes

 ASC:
 Selection sort       Time elapsed:       1618ms,        1 249 975 000 compares,                    0 swaps,        2 499 950 000 reads,                    0 writes
 Insertion sort       Time elapsed:          3ms,               49 999 compares,                    0 swaps,               99 998 reads,                    0 writes
 Bubble sort          Time elapsed:       1446ms,        1 249 975 000 compares,                    0 swaps,        2 499 950 000 reads,                    0 writes
 My Merge sort        Time elapsed:         20ms,              382 512 compares,                    0 swaps,            1 549 488 reads,              784 464 writes

 DESC:
 Selection sort       Time elapsed:       3840ms,        1 249 975 000 compares,               25 000 swaps,        2 500 000 000 reads,               50 000 writes
 Insertion sort       Time elapsed:       4273ms,        1 249 975 000 compares,        1 249 975 000 swaps,        4 999 900 000 reads,        2 499 950 000 writes
 Bubble sort          Time elapsed:       6037ms,        1 249 975 000 compares,        1 249 975 000 swaps,        4 999 900 000 reads,        2 499 950 000 writes
 My Merge sort        Time elapsed:         16ms,              401 952 compares,                    0 swaps,            1 588 368 reads,              784 464 writes
 *
 */
public class CompareSortMethods {
    public static final int ARRAY_SIZE = 50000;
    public static final int ARRAY_ELEMENTS_SIZE = 10000; //Integer.MAX_VALUE;

    private static int[] original = generateRandomArray(ARRAY_SIZE);
//    private static int[] original = generateASCArray(ARRAY_SIZE);
//    private static int[] original = generateDESCArray(ARRAY_SIZE);


    public static void main(String[] args) throws InterruptedException {

        doSort("Selection sort", getCopyArray(), new SelectionSort());
        doSort("Insertion sort", getCopyArray(), new InsertionSort());
        doSort("Bubble sort", getCopyArray(), new BubbleSort());
        doSort("My Merge sort", getCopyArray(), new MyMergeSort());

    }

    public static int[] getCopyArray() {
        int[] copy = new int[ARRAY_SIZE];
        System.arraycopy(original, 0, copy, 0, ARRAY_SIZE);
        return copy;
    }

    public static void doSort(String name, int[] array, AbstractSort method) {
        Date startTime, stopTime;

        System.out.print(ARRAY_SIZE <= 100 ? Arrays.toString(array) + "\n" : "");

        startTime = new Date();           //получаем текущую дату и время
        SortMetrics metrics = method.sort(array);
        stopTime = new Date();

        System.out.print(ARRAY_SIZE <= 100 ? Arrays.toString(array) + "\n" : "");
        System.out.printf("%-20s Time elapsed: %10dms, %s\n", name, (stopTime.getTime() - startTime.getTime()), metrics);
    }


    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
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
