package sorting.methods;

import sorting.CompareSortMethods;

import java.util.Arrays;

/**
 * Created by user on 01.02.2017.
 */
public class MyMergeSort extends AbstractSort {

//    public static void main(String[] args) {
//        int[] array = CompareSortMethods.generateRandomArray(3);
//        System.out.println(Arrays.toString(array));
//        new MyMergeSort().doSort();
//        System.out.println(Arrays.toString(array));
//
//    }

    @Override
    public void doSort() {
        sort0(0, getArrayLength() - 1);
    }

    private void sort0(int low, int high) {

        if (high + 1 - low < 2) {
            return;
        }

        int left1 = low;
        int left2 = high - (high - low) / 2 - 1;
        int right1 = high - (high - low) / 2;
        int right2 = high;

        sort0(left1, left2);
        sort0(right1, right2);

        // merge
        merge0(left1, left2, right1, right2);

//        int[] array0 = new int[high - low + 1];
//        int a = low + (high - low) / 2, b = a + 1; int c = low;
//
//        for (int i = 0; i < array0.length; i++) {
//            if (b > high || array[c] < array[b]) {
//                array0[i] = array[c];
//                c++;
//            } else {
//                array0[i] = array[b];
//                b++;
//            }
//        }
//
//        for (int i = low, j = 0; i <= high; i++, j++) {
//            array[i] = array0[j];
//        }

    }

    private void merge0(int left1, int left2, int right1, int right2) {
        int from = left1;
        int to = right2;
        int[] sorted = new int[right2 - left1 + 1];

        for (int i = 0; i < sorted.length ; i++) {
            if (right1 > right2 || (left1 <= left2 && compare(left1, right1) == -1)) { // array[left1] < array[right1]
                sorted[i] = getElementByIndex(left1); // array[left1];
                left1++;
            } else {
                sorted[i] = getElementByIndex(right1); //array[right1];
                right1++;
            }
        }

        for (int i = from, j = 0; i <= to; i++, j++) {
            setElementByIndex(i, sorted[j]); // array[i] = sorted[j];
        }

    }



//    private void merge0(int left1, int left2, int right1, int right2) {
//        int from = left1;
//        int to = right2;
//        int[] sorted = new int[right2 - left1 + 1];
//
//        for (int i = 0; i < sorted.length ; i++) {
//            if (right1 > right2 || (compare(left1, right1) == -1 && left1 <= left2)) { // array[left1] < array[right1]
//                sorted[i] = array[left1];
//                left1++;
//            } else {
//                sorted[i] = array[right1];
//                right1++;
//            }
//        }
//
//        for (int i = from, j = 0; i <= to; i++, j++) {
//            array[i] = sorted[j];
//        }
//
//    }



}
