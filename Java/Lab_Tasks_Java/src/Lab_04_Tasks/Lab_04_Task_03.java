package Lab_04_Tasks;
import java.util.Scanner;

public class Lab_04_Task_03 {
    public static void main(String[] args) {

        // Task 03: Checking whether a number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        int i;
        boolean isPrime = true;

        if(num==0 || num==1)
            isPrime = false;

        for(i=2; i<=num/2; i++)      // loop till i=2 to i<=num/2 (because we know there is no factor beyond num/2. So, any iteration beyond num/2 is redundant )
        {
            if(num%i==0)
            {
                isPrime = false;
                break;
            }  // end of if statement
        }    // end of for loop

        if(isPrime){       // same as isPrime==true
            System.out.println(num+" is a prime number");
        }   else {
            System.out.println(num+" is not a prime number");
        }  // end of if else

    }    // end of main() method
}      // end of program
