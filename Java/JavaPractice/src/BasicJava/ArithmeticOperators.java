package BasicJava;
import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.println(num1+" + "+num2+" = "+sum);
        System.out.println(num1+" - "+num2+" = "+diff);
        System.out.println(num1+" * "+num2+" = "+mul);
        System.out.println(num1+" / "+num2+" = "+div);
        System.out.println("Hello, World");
    }
}
