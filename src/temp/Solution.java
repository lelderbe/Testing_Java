package temp;


import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//// напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = reader.readLine();
//
////        File file = new File(fileName);
////        file.createNewFile();
//        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
//        String input = "";
//        String exit = "exit";
//
//        do {
//            input = reader.readLine();
//            writer.write(input);
//            writer.newLine();
//        } while (!input.equals(exit));
//
//
//
//        reader.close();
//        writer.close();
//



//        int e = new int[4][8].length;
//        System.out.println(e);


//        int a = 5;
//
//        System.out.println(++a);
//
//        a = 5;
//
//        System.out.println(a++);


//        byte a = 5;
//        byte b = 3;
//        byte c = (byte) (a++ + ++b);

//        int a = 6;
//        int b = 4;
//        a = ++a + b++ + a++;
//        int c = --a + b--;
//        System.out.println("a: " + a + ", b: " + b + ", c: " + c);


        byte a = 2, b = 3;
        byte c = a == b-- ? a : b;
        System.out.print(c);

    }
}
