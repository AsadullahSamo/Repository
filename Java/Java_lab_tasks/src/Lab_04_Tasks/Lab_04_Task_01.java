package Lab_04_Tasks;
import java.util.Scanner;

public class Lab_04_Task_01 {
    public static void main(String[] args) {

        // Task 01: Checking Vowel OR Consonant using Switch Statement
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any alphabet: ");
            char alphabet = sc.next().charAt(0);

            switch(alphabet)
            {
                case 'a':
                    System.out.println(alphabet+" is Vowel");
                    break;
                case 'e':
                    System.out.println(alphabet+" is Vowel");
                    break;
                case 'i':
                    System.out.println(alphabet+" is Vowel");
                    break;
                case 'o':
                    System.out.println(alphabet+" is Vowel");
                    break;
                case 'u':
                    System.out.println(alphabet+" is Vowel");
                    break;
                case 'A':
                    System.out.println(alphabet+" is Vowel");
                    break;
                case 'E':
                    System.out.println(alphabet+" is Vowel");
                    break;
                case 'I':
                    System.out.println(alphabet+" is Vowel");
                    break;
                case 'O':
                    System.out.println(alphabet+" is Vowel");
                    break;
                case 'U':
                    System.out.println(alphabet+" is Vowel");
                    break;
                default:
                    System.out.println(alphabet+" is Consonant");
            }   // end of switch statement


    }    // end of main() method
}       // end of program
