package sorting.utils;

/**
 * Created by user on 05.03.2017.
 */
public class SortMetrics {
    public long compareCount;
    public long swapCount;
    public long readCount;
    public long writeCount;

    public void init() {
        compareCount = 0;
        swapCount = 0;
        readCount = 0;
        writeCount = 0;
    }

    @Override
    public String toString() {
        return String.format("%,20d compares, %,20d swaps, %,20d reads, %,20d writes", compareCount, swapCount, readCount, writeCount);
//        compareCount + " compares, " + swapCount + " swaps";
    }

}
