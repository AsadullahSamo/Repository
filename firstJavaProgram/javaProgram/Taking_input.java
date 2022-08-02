package javaProgram;
import java.util.Scanner;              // to import scanner class from java.util package

public class Taking_input {
    public static void main(String[] args) {

        System.out.println("Taking user input");
        Scanner sc= new Scanner(System.in);      // sc is object of class Scanner
        // Taking integer values input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();            // nextInt is method used to take integer value as input
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.print("Sum of the numbers you entered is: ");
        System.out.println(sum);

        System.out.print("Enter first decimal number: ");
        float num3 = sc.nextFloat();
        System.out.print("Enter first decimal number: ");
        float num4 = sc.nextFloat();
        float sum2 = num3+num4;
        System.out.print("Sum of two decimal numbers you entered is: ");
        System.out.println(sum2);

        // to read string from keyboard
        System.out.println("Enter a word ");
        String word = sc.next();             // Takes only one word (when whitespace comes it stops reading)
        System.out.println(word);
        System.out.println("Enter a string ");
        String line = sc.nextLine();             // Takes entire line
        System.out.println(line);


        // Demonstrating hasNextInt method
        System.out.print("Enter an integer number: ");
        boolean b1= sc.hasNextInt();           // checks whether entered number is integer  or not
        System.out.println(b1);            // hasNextInt usually used for checking expression validity

    }
}
