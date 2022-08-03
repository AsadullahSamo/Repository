package Loops_and_Decisions;
import java.util.Scanner;

public class Chapter_04_loops_Questions {
    public static void main(String[] args) {

        // Question 1: Printing pattern
        int i, j;
        for(i=1; i<=4; i++)
        {
            for(j=i; j<=4; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }   // end of outer for

        // Question 2: Finding sum of first n numbers using while loop
        Scanner sc = new Scanner(System.in);
        int k=2, n, sum=0;
        System.out.print("Enter a number to sum up to that number: ");
        n = sc.nextInt();
        System.out.println("Using while loop ");
        while(k<=n)
        {
           sum = sum + k;
           if(k==n)
           System.out.print(k);
           else
            System.out.print(k+"+");
           k+=2;
        }
        System.out.println("="+sum);

        // Question 3: Printing multiplication table
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(i=1; i<=10; i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }

        // Question 4: Printing table of 10 in reverse order using multiplication table
        for(i=10; i>0; i--)
        {
            System.out.println(10+"*"+i+"="+10*i);
        }

        // Question 5: Factorial of a number
        int num2, fact=1;
        System.out.print("Enter a number:");
        num2 = sc.nextInt();
        for(i=num2; i>0; i--)
        {
            fact*=i;
        }
        System.out.printf("Using for loop, Factorial of %d is %d\n" ,num2, fact);

        // Question 6: Factorial of a number using while loop
        int num3, factorial=1;
        System.out.print("Enter a number: ");
        num3 = sc.nextInt();
        i=num3;
        while(i>0)
        {
            factorial*=i;
            i--;
        }
        System.out.printf("Using while loop, Factorial of %d is %d\n" ,num3, factorial);

        // Question 7: Printing pattern using while loop
        System.out.println("Using while loop pattern is ");
        int num4 = 1;
        while(num4<=4)
        {
            for (i=num4; i<=4; i++)
            {
                System.out.print("*");

            }
            System.out.println();
            num4++;
        }

        // Question 9: Getting sum of multiples of 8
        n=8; sum=0;
        for(i=1; i<=10; i++)
        {
            sum += (n*i);
            if(i==10)
            System.out.print(8*i);
            else
            System.out.print(8*i+"+");
        }
        System.out.print("="+sum);

        // Question 11: Sum of first n even numbers using for loop
         sum=0;
        System.out.println("Using for loop ");
         for(i=0; i<=10; i+=2)
         {
             sum += i;
         }
        System.out.println("Sum till 10 is "+sum);
    } // end of main function



}    // end of class
