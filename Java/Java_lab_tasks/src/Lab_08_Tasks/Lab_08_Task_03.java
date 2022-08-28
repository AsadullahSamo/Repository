package Lab_08_Tasks;
import java.util.Scanner;

class InvalidPasswordFormatException extends Exception{
    public void lessChars(){
        System.out.println("Characters are less than 8");
    }
    public void asterik(){
        System.out.println("Password contains *");
    }
}

public class Lab_08_Task_03 {
    public static void main(String[] args) {

        // Question 02: Create a InvalidPasswordException which throws an exception in following scenarios
        // 1. Password is less than 8 characters
        // 2. Password has asterik
        InvalidPasswordFormatException in = new InvalidPasswordFormatException();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = sc.nextLine();
        int length = password.length();

            try{
                throw new InvalidPasswordFormatException();
            }
            catch(Exception e){
                if(password.contains("*"))
                in.asterik();
                else if(password.contains("*") && length<8)
                in.asterik();
                else if(length<8)
                    in.lessChars();
                else
                System.out.println("No exception");
            }      // end of try catch block

    }      // end of main() method
}         //  end of program
