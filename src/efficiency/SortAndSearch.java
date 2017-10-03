package efficiency;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by user on 26.03.2016.
 */
public class SortAndSearch {

    public static int[][] arrays = {{}, {1}, {2, 1}, {4, 6, 2}, {0, 3, 2, 1}, {8, 6, 1, 3, 2, 0, 7, 3, 4, 5}};
    public static int[] array = new int[Short.MAX_VALUE]; //Short.MAX_VALUE
    public static int[] array2 = new int[Short.MAX_VALUE]; //Short.MAX_VALUE
    public static int[] array3 = new int[Short.MAX_VALUE - 100]; //Short.MAX_VALUE

    public static int[] arrayResult = new int[Short.MAX_VALUE * 2]; //Short.MAX_VALUE

//    public static int[] sortedArray = new int[Short.MAX_VALUE];


//    static {
////        randomArrayInit(randomArray);
//        sortedArrayInit(sortedArray);
//    }

    public static void randomArrayInit(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
//            arr[i] = (int) (Math.random() * 100);
        }
//        System.out.println(Arrays.toString(arr));
    }

    public static void sortedArrayInit(int[] arr) {
        randomArrayInit(arr);
        sortBySelect_v3(arr);
//        System.out.println(Arrays.toString(arr));
        if (true) return;

        for (int i = 1; i < arr.length - 1; i += 1000) {
//            arr[i] = arr[i - 1] - 5;
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
//        System.out.println(Arrays.toString(arr));
    }

    public static void invertedArrayInit(int[] arr) {
        randomArrayInit(arr);
        sortBySelect_v3(arr);
        invertByLoop(arr);
    }


    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void invertByLoop(int[] arr) {
        // Инверсия массива с помощью цикла
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - 1 - i);
        }
    }

    public static void invertArrayByRecurrsion(int[] arr, int i) {
        // Инвертирование массива с помощью рекурсии
        if (i < arr.length / 2) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
            invertArrayByRecurrsion(arr, i + 1);
        }
    }

    public static void sortByBubble(int[] arr) {
        // Сортировка методом пузырька по возрастанию
        for (int i = 0; i < arr.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    sorted = false;
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
                }
            }
            if (sorted)
                break;
        }
    }

    public static void sortByBubbleFromRight(int[] arr) {
        // Сортировка методом "пузырька" по возрастанию, гоним меньшие элементы справа налево
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > (0 + i) ; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
            }
        }
    }

    public static void sortBySelect_v1(int[] arr) {
        // Сортировка методом выборки по возрастанию
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    swap(arr, j, i);
            }
        }
    }

    public static void sortBySelect_v2(int[] arr) {
        // Сортировка методом выборки по возрастанию
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;              // Находим индекс и только потом swap
            }
            swap(arr, i, min_index);
        }
    }

    public static void sortBySelect_v3(int[] arr) {
        // Сортировка методом выборки по возрастанию
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = (i + 1), min = arr[min_index]; j < arr.length; j++) {
                if (arr[j] < min) {
                    min_index = j;
                    min = arr[j];           // Обращение к локальной переменной
                }
            }
            swap(arr, i, min_index);
        }
    }

    public static void sortByInsert(int[] arr) {
        // Сортировка методом вставки
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void sortByInsert_v2(int[] arr) {
        // Сортировка методом вставки
        for (int i = 1; i < arr.length; i++) {
            int newValue = arr[i];      // Обращение к локальной переменной
            for (int j = i; j > 0; j--) {
                if (newValue < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void sortByInsert_v3(int[] arr) {
        // Сортировка методом вставки
        for (int i = 1; i < arr.length; i++) {
            int newValue = arr[i];      // Обращение к локальной переменной
            int location = i - 1;
            for (int j = i; j > 0; j--) {
                if (newValue < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    location--;
//                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
            arr[location + 1] = newValue;
        }
    }

    public static void sortByInsert_v4(int[] arr) {
        // Сортировка методом вставки
        for (int i = 1; i < arr.length; i++) {
            int newValue = arr[i];      // Обращение к локальной переменной
//            int location = i - 1;

//            int location = binarySearch(arr, newValue, 0, i - 1);
            int location = binarySearchRecc(arr, newValue, 0, i - 1);
            if (location < 0) {
                location = -location - 1;
            }

            for (int j = i; j > location; j--) {
                arr[j] = arr[j - 1];
//                location--;
//                    swap(arr, j, j - 1);
            }
            arr[location] = newValue;

        }
    }

    public static int binarySearch(int[] arr, int value, int from, int to) {
        int offset = from;
        int length = to + 1 - from;
        int i = -1;

        while (length > 0) {
//            System.out.println("offset: " + offset + ", length: " + length);

            i = offset + length / 2;

            if (arr[i] == value) {
                return i + 1;
            } else if (arr[i] > value) {
                length = length / 2;
            } else {
                offset = i + 1;
                length = (length - 1) / 2;
            }
        }

        return offset;

//        return i;
    }

    public static int binarySearchRecc(int[] arr, int value, int from, int to) {
        int length = to + 1 - from;

        if (length > 0) {
            int i = from + length / 2;

            if (arr[i] == value) {
                return i;
            } else if (arr[i] > value) {
                to = i - 1;
            } else {
                from = i + 1;
            }
        } else {
            if (from > to) {
                return (-from - 1);
            } else {
                return to;
            }
        }

        return binarySearchRecc(arr, value, from, to);
    }



    public static void arrayMerge(int[] arr1, int[] arr2, int[] result) {
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (index1 < arr1.length && index2 < arr2.length) {
                if (arr1[index1] <= arr2[index2]) {
                    result[i] = arr1[index1++];
                } else {
                    result[i] = arr2[index2++];
                }
            } else if (index1 < arr1.length) {
//                System.arraycopy();
                result[i] = arr1[index1++];
            } else if (index2 < arr2.length) {
                result[i] = arr2[index2++];
            }
        }
    }

    public static void main(String[] args) {


//        for (int i = 0; i < arrays.length; i++) {
//            System.out.println(Arrays.toString(arrays[i]));
//
////            invertByLoop(arrays[i]);                // Инверсия массива с помощью цикла
////            invertArrayByRecurrsion(arrays[i], 0);  // Инвертирование массива с помощью рекурсии
//
////            sortByBubbleFromRight(arrays[i]);       // Сортировка методом "пузырька" по возрастанию, гоним меньшие элементы справа налево
////            sortByBubble(arrays[i]);              // Сортировка методом пузырька по возрастанию
////            sortBySelect_v1(arrays[i]);   // Сортировка методом выборки по возрастанию
////            sortBySelect_v2(arrays[i]); // Сортировка методом выборки по возрастанию, поиск индекса требуемого элемента
////            sortBySelect_v3(arrays[i]); // Сортировка методом выборки по возрастанию, поиск индекса требуемого элемента, заведение локальной переменной
////            sortByInsert(arrays[i]);    // Сортировка методом вставки
////            sortByInsert_v2(arrays[i]);    // Сортировка методом вставки, заведение локальной переменной
////            sortByInsert_v3(arrays[i]);    // Сортировка методом вставки,  заведение локальной переменной, уменьшенное количество изменений ячеек массива
////            sortByInsert_v4(arrays[i]);    // Сортировка методом вставки,  заведение локальной переменной, уменьшенное количество изменений ячеек массива
//            System.out.println(binarySearchRecc(arrays[i], 0, 0, arrays[i].length - 1));
////            if (position < 0) {
////                position = -position - 1;
////            }
////            System.out.println(position);
//
//            System.out.println(Arrays.toString(arrays[i]));
//        }



//        System.exit(0);

        Date startTime = null;
        long t1 = 0;

//        System.out.println("Merge arrays: ");
//
//        sortedArrayInit(array2);
//        sortedArrayInit(array3);
//        startTime = new Date();           //получаем текущую дату и время
//        arrayMerge(array2, array3, arrayResult);
//        System.out.println("arrayMerge, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");
//
//
//        System.exit(0);



        System.exit(0);

        System.out.println("Random arrays: ");

        randomArrayInit(array);
//        startTime = new Date();           //получаем текущую дату и время
//        t1 = System.nanoTime();
        t1 = System.currentTimeMillis();
        sortByBubble(array);
//        System.out.println("sortByBubble, Time elapsed: " + (System.nanoTime() - t1)/1_000_000 + " ms");
//        System.out.format("%-25s %20s", "sortByBubble, Time elapsed: ", (System.currentTimeMillis() - t1) + " ms");
        System.out.println("sortByBubble, Time elapsed: " + (System.currentTimeMillis() - t1) + " ms");

        randomArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortBySelect_v1(array);
        System.out.println("sortBySelect_v1, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        randomArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortBySelect_v2(array);
        System.out.println("sortBySelect_v2, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        randomArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortBySelect_v3(array);
        System.out.println("sortBySelect_v3, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        randomArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert(array);
        System.out.println("sortByInsert, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        randomArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert_v2(array);
        System.out.println("sortByInsert_v2, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        randomArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert_v3(array);
        System.out.println("sortByInsert_v3, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        randomArrayInit(array);
//        System.out.println(Arrays.toString(array));
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert_v4(array);
        System.out.println("sortByInsert_v4, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");
//        System.out.println(Arrays.toString(array));

//        System.exit(0);

        System.out.println("Sorted arrays: ");

        sortedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByBubble(array);
        System.out.println("sortByBubble, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        sortedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortBySelect_v1(array);
        System.out.println("sortBySelect_v1, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        sortedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortBySelect_v2(array);
        System.out.println("sortBySelect_v2, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        sortedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortBySelect_v3(array);
        System.out.println("sortBySelect_v3, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        sortedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert(array);
        System.out.println("sortByInsert, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        sortedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert_v2(array);
        System.out.println("sortByInsert_v2, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        sortedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert_v3(array);
        System.out.println("sortByInsert_v3, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        sortedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert_v4(array);
        System.out.println("sortByInsert_v4, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");



        System.out.println("Inverted arrays: ");

        invertedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByBubble(array);
        System.out.println("sortByBubble, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        invertedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortBySelect_v1(array);
        System.out.println("sortBySelect_v1, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        invertedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortBySelect_v2(array);
        System.out.println("sortBySelect_v2, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        invertedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortBySelect_v3(array);
        System.out.println("sortBySelect_v3, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        invertedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert(array);
        System.out.println("sortByInsert, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        invertedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert_v2(array);
        System.out.println("sortByInsert_v2, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        invertedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert_v3(array);
        System.out.println("sortByInsert_v3, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");

        invertedArrayInit(array);
        startTime = new Date();           //получаем текущую дату и время
        sortByInsert_v4(array);
        System.out.println("sortByInsert_v4, Time elapsed: " + (new Date().getTime() - startTime.getTime()) + " ms");



        System.exit(0);



    }

}
