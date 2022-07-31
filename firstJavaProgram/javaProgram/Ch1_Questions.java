package javaProgram;
import java.util.Scanner;

public class Ch1_Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Question 1
        int a=5, b=7, c=9;
        int sum = a+b+c;
        System.out.println("Sum is "+sum);

        // Question 2
        float x=45, y=95, z=48;
        float cgpa = (x+y+z)/30;
        System.out.println("CGPA is "+cgpa);

        // Question 3
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello "+name+" have a good day!");

        // Question 4
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        double miles = km * 0.6214;
        System.out.println(km+" in miles= "+miles);

        // Question 5
        System.out.print("Enter an integer number: ");
        boolean b1 = input.hasNextInt();
        System.out.println(b1);
    }
}
