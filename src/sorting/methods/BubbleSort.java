package sorting.methods;

/**
 * Created by user on 29.01.2017.
 */
public class BubbleSort extends AbstractSort {

    @Override
    public void doSort() {
        int arrayLength = getArrayLength();

        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - 1 - i; j++) {
                if (compare(j, j + 1) == 1) { // array[j] > array[j + 1]
                    swap(j, j + 1);
                }
            }
        }
    }
}
