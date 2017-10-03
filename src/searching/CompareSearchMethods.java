package searching;


import sorting.methods.MyMergeSort;

import java.util.Date;

/**
 * Created by user on 02.02.2017.
 */
public class CompareSearchMethods {
    public static void main(String[] args) {

        int[] array = sorting.CompareSortMethods.generateRandomArray(5000000);
        new MyMergeSort().sort(array);

        doSearch("Linear search", array, new LinearSearch());
        doSearch("Binary search iteration", array, new BinarySearchIteration());

    }

    public static void doSearch(String name, int[] array, Searchable method) {
        Date startTime, stopTime;

        startTime = new Date();           //получаем текущую дату и время
        System.out.println(method.search(array, -1));
        stopTime = new Date();

        System.out.println(name + ". Time elapsed: " + (stopTime.getTime() - startTime.getTime()) + " ms");

    }
}
