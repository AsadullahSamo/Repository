package Conditional_Statements;
import java.util.Scanner;

public class Question_11_30 {
    public static void main(String[] args) {
        // Question 11: Displaying n terms and their sum AND     Question 12: Computing average
        Scanner sc = new Scanner(System.in);
//        int sum = 0, i, n, j;          float avg;
//        System.out.print("Enter a number: ");
//        n = sc.nextInt();
//        System.out.println("From Question 11: First "+n+" terms: ");
//        for(i=1; i<=n; i++)
//        {
//            System.out.print(i+" ");
//            sum += i;
//        }
//        avg = sum / n;
//        System.out.println("\nSum of first "+n+" terms is: "+sum);
//        System.out.println("From Question 12: Average is: "+avg);
//
//        // Question 13: Displaying cube of number up to given number
//        int num;
//        System.out.print("Enter a number: ");
//        num = sc.nextInt();
//        System.out.println("From Question 13:");
//        for(i=1; i<=num; i++)
//        {
//            System.out.println("Number is: "+i+" and cube of "+i+" is: "+(int)Math.pow(i, 3));
//        }
//
//        // Question 14: Printing Table
//        int num2;
//        System.out.print("Enter a number: ");
//        num2 = sc.nextInt();
//        System.out.println("From Question 14");
//        for(i=1; i<=num2; i++)
//        {
//            System.out.printf("%d X %d = %d", num2, i, num2*i);
//            System.out.println();
//        }
//        System.out.println("From Question 17: ");
//        for(i=1; i<=rows2; i++)
//        {
//            for(j=1; j<=i; j++)
//            {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//        // Question 15: displaying sum of odd terms up to n terms
//        int num3;
//        sum = 0;
//        System.out.print("Enter a number: ");         num3 = sc.nextInt();
//        System.out.println("From Question 15: The odd numbers are");
//        for(i=1; i<num3*2; i+=2)
//        {
//            System.out.print(i+" ");
//            sum += i;
//        }
//        System.out.println("\nThe sum of odd natural numbers upto 5 terms is: "+sum);
//
//        // Question 16: Displaying pattern
//        System.out.println("Enter number of rows: ");          // 5
//        int rows = sc.nextInt();
//        System.out.println("From Question 16: ");
//        for(i=1; i<=rows; i++)
//        {
//            for(j=1; j<=i; j++)
//            {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        // Question 17: Displaying pattern
//        System.out.println("Enter number of rows: ");
//        int rows2 = sc.nextInt();

        // Question 32: Checking floating point numbers upto two decimal places
        System.out.println("Enter first number: ");
        float num_one = sc.nextFloat();
        System.out.println("Enter second number: ");
        float num_two = sc.nextFloat();
        num_one = Math.round(num_one*100);
        num_one = num_one/100;
        num_two = Math.round(num_two*100);
        num_two = num_two/100;
        if(num_one==num_two)
            System.out.println("They are same upto two decimal places");
        else
            System.out.println("They are different");



    }    // end of main()
}     // end of class
