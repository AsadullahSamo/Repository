package Lab_tasks;
import java.util.Scanner;

public class Lab_01_Questions {
    public static void main(String[] args) {

        // Question 01: Printing hello World
        System.out.println("Question 01: Printing hello World");
        System.out.println("Hello World");


        // Question 02: Separating fractional and integer part
        System.out.println("Question 02: Separating fractional and integer part");
        System.out.print("Enter a decimal value: ");
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        int intPart = (int)value;
        System.out.println("Integer part is: "+intPart);
        double fracPart = (value - intPart) ;
        System.out.println("Fractional part is: "+fracPart);

        // Question 03: Printing face
        System.out.println("Question 03: Printing face");
        System.out.println("   "+"+  \"  \"  +");
        System.out.println("  "+"[|  O   O |]");
        System.out.println("  "+" |    ^   |");
        System.out.println("  "+ " |   '-'  |");

    }    // end of main() method
}      // end of class
