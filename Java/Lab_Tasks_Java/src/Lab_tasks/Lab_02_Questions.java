package Lab_tasks;
import java.util.Scanner;

public class Lab_02_Questions {

    public static void main(String[] args) {

        // Question 01: Declaring, finding sum and average of 5 floating point numbers
        System.out.println("Question 01: Declaring, finding sum and average of 5 floating point numbers");
        float f1 = 45.7f, f2 = 78.6f, f3 =  4.56f, f4 =  78.00f, f5 =  12.5f;
        float sum = f1+f2+f3+f4+f5;
        System.out.println("Sum of "+f1+"+"+f2+"+"+f3+"+"+f4+"+"+f5+" is "+sum);

        // Question 2: Finding diameter, area and circumference of a circle
        System.out.println("Question 2: Finding diameter and circumference of three circle with radius values");
        Scanner sc = new Scanner(System.in);
            int radius = 5;
            System.out.println("Circumference of circle is "+2*Math.PI*radius);
            System.out.println("Diameter of circle is "+2*radius);
            System.out.println("Area of circle is "+Math.PI*radius*radius);


        // Question 03
        System.out.println("Question 03");
        int num = 5843;
        int result = num / 5843;
        System.out.println("Rs.5000: "+result);
        int num2 = num % 5000;
        int result2 = num2 / 1000;
        System.out.println("Rs.1000: "+result2);
        int result3 = num2 / 500;
        System.out.println("Rs.500: "+result3);
        int num3 = num2 % 500;
        int result4 = num3 / 100;
        System.out.println("Rs.100: "+result4);
        int num4 = num3 % 100;
        int result5 = num4 / 50;
        System.out.println("Rs.50: "+result5);
        int result6 = num4 / 10;
        System.out.println("Rs.10: "+result6);
        int num5 = num4 % 10;
        int result7 = num5 / 5;
        System.out.println("Rs.5: "+result7);
        int result8 = num5 / 1;
        System.out.println("Rs.1: "+result8);


    }    // end of main() method
}    // end of class
