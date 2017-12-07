package polymorph.fields;

/*
 Отрабатывает RTTI. Да, тип переменной у нас BaseClass, но Java в Runtime определяет, на какой же реально объект ссылается переменная - и вызывает метод у этого объекта.
 Т.к. реально объект у нас DerivedClass, то и метод вызовется у него - так работает полиморфизм.
 А вот обращения к полям так не работают. К полям происходит обращение основываясь на типе переменной.
 Если объявлена переменная типа BaseClass, но содержит в себе объект DerivedClass, то всё равно выведется значение поля из BaseClass.
 Например:
*/

public class Solution {
    public static void main(String[] args) {
        A instance = new B();

        instance.method();
        System.out.println(instance.x);
    }
}

class A {
    public int x = 3;

    public void method() {
        System.out.println("method A");
    }
}

class B extends A {
    public int x = 4;

    @Override
    public void method() {
        System.out.println("method B");
    }
}
