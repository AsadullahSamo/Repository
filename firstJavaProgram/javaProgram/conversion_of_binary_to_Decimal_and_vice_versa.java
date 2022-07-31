package javaProgram;
import java.util.*;

public class conversion_of_binary_to_Decimal_and_vice_versa {
    public static void main(String[] args) {
        // Converting decimal to binary
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println(decimal+ " in binary is "+binary);

        // Converting binary to decimal
        System.out.print("Enter a binary number: ");
        String bin = sc.next();
        int dec = Integer.parseInt(bin, 2);
        System.out.println(bin+" in decimal is equal to "+dec);
    }
}
