package searching;

/**
 * Created by user on 02.02.2017.
 */
public class LinearSearch implements Searchable {
    @Override
    public boolean search(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }

        return false;
    }
}
