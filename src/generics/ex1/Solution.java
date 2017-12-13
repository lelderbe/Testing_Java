package generics.ex1;

public class Solution {
    public static void main(String[] args) {
        Ex1<Integer> ex1 = new Ex1<>(5);
        ex1.method();

        Ex1<String> ex2 = new Ex1<>("Hello");
        ex2.method();
    }
}

class Ex1<T> {
    private T value;

    public Ex1(T value) {
        this.value = value;
    }

    public void method() {
        System.out.println(value.getClass());
    }
}