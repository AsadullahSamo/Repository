package Loops_and_Decisions;
import java.util.Scanner;

public class Enhanced_Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // enhanced switch
        switch(age){
            case 18 -> System.out.println("You are going to become an adult");
            case 23 -> System.out.println("you are about to get a job");
            case 60 -> System.out.println("You are about to retire");
            default -> System.out.println("Happy");
        } // end of enhanced switch

    }
}
