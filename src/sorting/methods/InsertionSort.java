package sorting.methods;

/**
 * Created by user on 29.01.2017.
 */
public class InsertionSort extends AbstractSort {

    @Override
    public void doSort() {
        int arrayLength = getArrayLength();
        int currentIndex;

        for (int i = 1; i < arrayLength; i++) {
            currentIndex = i;
            while (currentIndex > 0 && compare(currentIndex, currentIndex - 1) == -1) { // array[currentIndex] < array[currentIndex - 1]
                swap(currentIndex, currentIndex - 1);
                currentIndex--;
            }
        }
    }
}
