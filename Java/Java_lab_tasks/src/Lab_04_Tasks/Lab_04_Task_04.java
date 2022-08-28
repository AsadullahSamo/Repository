package Lab_04_Tasks;
import java.util.Scanner;

public class Lab_04_Task_04 {
    public static void main(String[] args) {
        // Question 04: Finding percentage and Grade of student using marks of five subjects
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for OOP: ");
        int OOP = sc.nextInt();
        System.out.print("Enter marks for DSA: ");
        int DSA = sc.nextInt();
        System.out.print("Enter marks for PP: ");
        int PP = sc.nextInt();
        System.out.print("Enter marks for ISE: ");
        int ISE = sc.nextInt();
        System.out.print("Enter marks for IS: ");
        int IS = sc.nextInt();

        int sum = OOP+PP+DSA+ISE+IS;
        float percentage = (float) (sum*100)/500;
        System.out.println("Percentage is: "+percentage);

        if(percentage>=50 && percentage<60){
            System.out.println("Your grade is C");
        }  else if(percentage>=60 && percentage<67){
            System.out.println("Your grade is C+");
        }  else if(percentage>=67 && percentage<75){
            System.out.println("Your grade is B");
        }  else if(percentage>=75 && percentage<83){
            System.out.println("Your grade is B+");
        }  else if(percentage>=83 && percentage<90){
            System.out.println("Your grade is A");
        }  else if(percentage>=90){
            System.out.println("Your grade is A+");
        }  else {
            System.out.println("You are fail");
        }    // end of if else

    }     // end of main() method
}        //  end of program
