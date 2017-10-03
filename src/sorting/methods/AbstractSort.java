package sorting.methods;

import sorting.utils.SortMetrics;

/**
 * Created by user on 29.01.2017.
 */
public abstract class AbstractSort {
    private int[] array;
    private SortMetrics sortMetrics = new SortMetrics();

    protected final int getArrayLength() {
        return array.length;
    }

    public final SortMetrics sort(int[] array) {
        this.array = array;
        sortMetrics.init();
        doSort();
        return sortMetrics;
    }

    // sorting algorithm
    public abstract void doSort();

    // compare array elements
    protected final int compare(int index1, int index2) {
        sortMetrics.compareCount++;
        int int1 = getElementByIndex(index1);
        int int2 = getElementByIndex(index2);
        if (int1 == int2) {
            return 0;
        } else {
            return int1 < int2 ? -1 : 1;
        }
    }

    // swap array elements with indexes index1 and index2
    protected final void swap(int index1, int index2) {
        if (index1 != index2) {
            sortMetrics.swapCount++;
            int temp = getElementByIndex(index1);
            setElementByIndex(index1, getElementByIndex(index2));
            setElementByIndex(index2, temp);

//            int temp = array[index1];
//            array[index1] = array[index2];
//            array[index2] = temp;
        }
    }

    protected final int getElementByIndex(int index) {
        sortMetrics.readCount++;
        return array[index];
    }

    protected final void setElementByIndex(int index, int value) {
        sortMetrics.writeCount++;
        array[index] = value;
    }

}
