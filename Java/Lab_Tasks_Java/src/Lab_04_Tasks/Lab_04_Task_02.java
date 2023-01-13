package Lab_04_Tasks;
import java.util.Scanner;

public class Lab_04_Task_02 {
    public static void main(String[] args) {

        // Task 02: Calculator
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number, operator, second number: ");
        int num1 = sc.nextInt();
        char op = sc.next().charAt(0);
        int num2 = sc.nextInt();
        int result = 0;

        switch(op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
        }     // end of switch statement

        System.out.println(num1+" "+op+" "+num2+" = "+result);

    }    // end of main() method
}      // end of program
