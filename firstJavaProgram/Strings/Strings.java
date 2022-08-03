package Strings;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name = new String("Asad");       // String is a class but can be used as data_type
        System.out.println(name);
        // or we can simply write
        String name2 = "Usman";
        System.out.println(name2);
       // methods to print in Java 4 methods
        System.out.print("My name is ");        // does not print any new line
        System.out.println(name);              // print new line too
        int a = 6;
        float b = 8.7f;
        System.out.printf("The value of a is %d and value of b is %f\n", a, b);      // works like
        // printf function in "C"        format specifiers are    %d-->int,   %f-->float, %c-->characters, %s-->string
        System.out.printf("The value of a is %d and value of b is %.2f\n", a, b);     // print 2 digits of decimal
        System.out.printf("The value of a is %d and value of b is %8.2f\n", a, b);    // takes 8 spaces and prints 2 digits of decimal
        System.out.format("The value of a is %d and value of b is %.2f\n", a, b);  // works same as printf function

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        // String str = sc.next();        // takes one word
        String str = sc.nextLine();         // takes entire line
        System.out.println(str);

    }
}
