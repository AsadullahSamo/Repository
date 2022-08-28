package Lab_08_Tasks;
import java.util.Scanner;
import java.lang.Exception;

class Eligibility extends Exception{

    public void eligible(){
        System.out.println("You are eligible");
    }
    public void notEligible(){
        System.out.println("You are not eligible");
    }
}

public class Lab_08_Task_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Eligibility e = new Eligibility();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

            try {
                throw new Eligibility();
            }
            catch(Exception ie){
                if(age<18)
                e.notEligible();
                else
                e.eligible();
            }
    }       // end of main() method
}            // end of
