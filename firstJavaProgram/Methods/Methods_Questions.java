package Methods;
import java.util.*;

public class Methods_Questions {
    static void Table(int x){
        for(int i=1; i<=10; i++)
        {
            System.out.printf("%d * %d = %d\n", x, i, x*i);
        }
    }   // end of Table() Method
    static void pattern(int n){
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
    }     // end of pattern() Method
    static int sum(int n){
        int sum = 0;
        if(n==1)
            return 1;
        else
            sum = n + sum(n-1);
        return sum;
    }    // end of sum() Method
    static void pattern2(int n){
        for (int i = 5; i >=1; i--)
        {
            for (int j = i; j >= n; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }     // end of pattern2() Method
    static int fab(int n){                     // 0 1 1 2 3 5 8 13 21 34 55

//        if(n==1)
//            return 0;
//        else if(n==2)
//            return 1;
        if(n==1 || n==2)
            return n-1;
        else
            return fab(n-1) + fab(n-2);
    }     // end of fab() Method
    static float average(int...arr){
        float sum = 0.0f;
        for(int element: arr){
            sum += element;
        }
        return sum/arr.length;
    }       // end of average() Method
    static void pattern_rec(int n) {
        if (n > 0)
        {
            pattern_rec(n - 1);
            for (int i = 1; i <= n; i++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
    }       // end of pattern_rec() Method

    static void pattern2_rec(int n) {
        if (n <=0)
        {
            pattern_rec(n - 1);
            for (int i = n; i >=1; i--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }       // end of pattern_rec() Method
    static void temperature(int celsius){
        float result = (float)(celsius*9/5)+32;
        System.out.println("Equivalent in farenheit is: "+result);
    }    // end of temperature() Method
    static int sum_iterative(int a){
        int sum = 0;
        for(int i=1; i<=a; i++)
        {
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {

        // Question 1: Printing Multiplication of 'n' table using method
        System.out.println("Question 1: ");
        Table(7);

        // Question 2: Printing pattern
        System.out.println("Question 2: ");
        pattern(4);

        // Question 3: Calculating sum of first n natural numbers using recursive function
        System.out.println("Question 3: ");
        System.out.println("Sum of first 7 natural numbers is: "+sum(7));

        // Question 4: Printing pattern
        System.out.println("Question 4: ");
        pattern2(2);

        // Question 5: Printing Fabonacci Series using Recursion
        System.out.println("Question 5: ");
        System.out.println(fab(7));

        // Question 6: Calculating average of set of numbers passed as arguments
        System.out.println("Question 6: ");
        float avg = average(4, 6, 8, 1, 2, 9, 7);
        System.out.println("The average is: "+avg);

        // Question 7: Repeating Question 2 using Recursion
        System.out.println("Question 7: ");
        pattern_rec(5);

        // Question 8: Repeating Question 4 using Recursion
//        System.out.println("Question 8: ");
//        pattern2_rec(4);

        // Question 9: Converting Celsius to Farenheit
        System.out.println("Question 9: ");
        temperature(8);

        // Question 10: Finding sum of n natural numbers using iterative approach
          System.out.println("Question 10: ");
          System.out.println("Using Iteration sum of first 10 natural numbers is: "+sum_iterative(10));

    }    // end of main() function
}       // end of class
