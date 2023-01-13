package Lab_08_Tasks;
import java.util.Scanner;

public class Lab_08_Task_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try{
            System.out.println(num/0);
        }
        catch(ArithmeticException ae){
            System.out.println("Exception named \'"+ae.getMessage()+"\' occured");
        }    // end of try catch block
    }        // end of main() method
}           // end of program
