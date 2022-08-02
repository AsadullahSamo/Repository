package Exception_Handling;
import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
       /* 1. Syntax Error
            int a = 9        // no semicolon
            c = 0;           // c not declared
        */

       /* 2. Logical Error --> When we don't get desired output
                for(int i=1; i<5; i++){
                    System.out.println(2*i+1);   // here we wanted to print prime numbers but due to error in logic we got odd numbers
                }
       */

        /* 3. Runtime Error    --> Also Called Exception
        Like if we have put an input which it does not handle for example if our program sums two numbers but user gave 5 + f then this is runtime error
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            System.out.println("1000/k is " + 1000/k);   // now this is syntaxically and logically correct but at runtime user may give like (value of k as 0 or g which is error)
        */

    }      // end of main()
}          // end of program
