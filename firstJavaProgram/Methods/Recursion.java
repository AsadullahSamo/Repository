package Methods;
import java.util.*;

public class Recursion {
    static int factorial(int n){
        int fact = 1;
        if(n==1)
            return 1;
        else
            fact = n * factorial(n-1);
            return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of "+num+" is "+result);

    } // end of main()
}    // end of class
