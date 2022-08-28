package Methods;
import java.util.*;

public class Method_Overloading {
    static void starline(char ch, int n){
        for(int i=1; i<=n; i++)
        {
            System.out.print(ch);
        }
        System.out.println();
    }     // end of starline with two args

     static void starline(char ch){
        for(int i=1; i<=10; i++)
        {
            System.out.print(ch);
        }
         System.out.println();
    }     // end of starline with one arg

    static void starline(){
        for(int i=1; i<=25; i++)
        {
            System.out.print("=");
        }
        System.out.println();
    }     // end of starline with no arg

    public static void main(String[] args) {
        // Method with same name but different number of arguments
        starline();     // call to starline with no arg
        starline('+');     // call to starline with one arg
        starline('-', 40);     // call to starline with two args

        // Taking user input to print
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter number of times to print it: ");
        int n = sc.nextInt();
        starline(ch, n);    // passing arguments to starline with two args
        System.out.print("Enter a character: ");
        char ch2 = sc.next().charAt(0);
        starline(ch2);      // passing arguments to starline with two args

        // Note: Method overloading can't be performed by changing the return type of methods

    }      // end of main()
}     // end of class
