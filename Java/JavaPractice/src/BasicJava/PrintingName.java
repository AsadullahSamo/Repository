package BasicJava;
import java.util.Scanner;

public class PrintingName {
    public static void main(String[] args) {
        System.out.println("Hello\nJava");
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first name ");
        String fname = s.next();
        System.out.print("Enter last name ");
        String lname = s.next();
        System.out.println("Hi "+fname+" "+lname);


    }
}
