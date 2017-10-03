/**
 * Created by user on 16.05.2016.
 */
public class HanoiPuzzle {
    static int counter = 1;

    public static void main(String[] args) {

        int num = 2;
        hanoi(num, 'A', 'B', 'C');

    }

    public static void hanoi(int num, char source, char spare, char destination) {
        if (num == 1) {
            System.out.println(counter++ + " : " + source + " -> " + destination);
        } else {
            hanoi(num - 1, source, destination, spare);
            System.out.println(counter++ + " : " + source + " -> " + destination);
            hanoi(num - 1, spare, source, destination);
        }

    }
}
