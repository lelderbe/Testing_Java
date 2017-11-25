package inheritance.protected_access;

public class Solution {
    public static void main(String[] args) {

        A a = new A();
        // геттеры наследуются и вызываются без проблем (выводя значения полей класса родителя)
        System.out.println(a.getA());   // private
        System.out.println(a.getB());   // protected

        System.out.println(a.getSuperAprotectedValue());    // чтение protected-поля у самого себя (своего объекта-родителя)
        SuperA superA = new SuperA(4);
        System.out.println(a.getSuperAprotectedValue2(superA)); // чтение protected-поля у другого объекта

        A a2 = new A(13);
        System.out.println(a.getSuperAprotectedValue3(a2)); // чтение protected-поля у другого объекта
        System.out.println(a.getSuperAprotectedValue2(a2)); // чтение protected-поля у другого объекта

        // Проверка equals. А что если поля в супер-классе объекта не равны?
        A a3 = new A(13);
        System.out.println(a);
        System.out.println(a3);
        System.out.println(a.equals(a3));

        String s = "Ok";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());
        String t = new String("Ok");
        StringBuilder st = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + st.hashCode());

        C c = new C();
        System.out.println(c.getClassSuperAvalue(superA));

    }


    public static class SuperA {
        private int a = 3;
        protected int b = 5;

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public SuperA() {
        }

        public SuperA(int b) {
            this.b = b;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }


    public static class A extends SuperA {
        private int c = 0;

        public A() {
        }

        public A(int b) {
            super(b);
        }

        public int getSuperAprotectedValue() {
            return b;
        }

        public int getSuperAprotectedValue2(SuperA superA) {
            return superA.b;
        }

        public int getSuperAprotectedValue3(A a) {
            return a.b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            if (!super.equals(o)) return false;

            A a = (A) o;

            return c == a.c;
        }

        @Override
        public int hashCode() {
            return c;
        }

        @Override
        public String toString() {
            return super.toString() + ", c=" + c;
        }
    }

    public static class C {
        public int getClassSuperAvalue(SuperA a) {
            return a.b;
        }
    }
}
