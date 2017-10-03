package pointers;

/**
 * Created by user on 27.11.2016.
 */
public class RefOrNot {
    public static void main(String[] args) {
        String a = "AAAAAA";
        String b = "BBBBBB";

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        method1(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        new RefOrNot().go();

    }

    public void go() {
        User user1 = new User(3);
        User user2 = new User(5);

        System.out.println(user1);
        System.out.println(user2);

        switchUsers(user1, user2);

        System.out.println(user1);
        System.out.println(user2);


    }

    public void switchUsers(User u1, User u2) {
        System.out.println("---------");
        System.out.println(u1);
        System.out.println(u2);

//        User z = u1;
//        u1 = u2;
//        u2 = z;

        u1.setAge(15);


        System.out.println(u1);
        System.out.println(u2);

        System.out.println("---------");

    }


    public static void method1(String x, String y) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);

//        String z = x;
        x = "ZZZZZZZZZZZZ";
        y = "2222222";

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    class User {
        int age;

        public User(int age) {
            this.age = age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "age = " + age;
        }
    }
}
