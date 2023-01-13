package Conditional_Statements;
import java.util.*;

public class Question_01_10 {
    public static void main(String[] args) {
        // Question 1: Checking number either it is +ve OR -ve
            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter a number: ");
//            int num = sc.nextInt();
//            if(num>0)
//                System.out.println("Number is positive\n");
//            else
//                System.out.println("Number is negative\n");
//
//            // Question 2: Solving quadratic equation
//            int a, b, c;
//            System.out.print("Enter a: ");
//            a = sc.nextInt();
//            System.out.print("Enter b: ");
//            b = sc.nextInt();
//            System.out.print("Enter c: ");
//            c = sc.nextInt();
//            float disc = (b*b-4*a*c);
//            if(disc>0) {
//                double r1 = (-b+Math.pow(disc, 0.5))/ (2.0 * a);
//                double r2 = (-b-Math.pow(disc, 0.5))/ (2.0 * a);
//                System.out.println("The roots are: "+r1+" and "+r2);
//            }
//            else if(disc==0){
//                double r1 = -b/(2.0 * a);
//                System.out.println("The root is: "+r1);
//            } else {
//                System.out.println("The equation has no real roots");
//            }

            // Question 3:  Printing the greatest number out of three numbers
//            System.out.print("Enter first number: ");
//            int num1 = sc.nextInt();
//            System.out.print("Enter second number: ");
//            int num2 = sc.nextInt();
//            System.out.print("Enter third number: ");
//            int num3 = sc.nextInt();
//            if(num1>num2 && num1>num3)
//                System.out.println("The greatest: "+num1);
//            if(num2>num1 && num2>num3)
//                System.out.println("The greatest: "+num2);
//            if(num3>num1 && num3>num2)
//                System.out.println("The greatest: "+num3);

            // Question 6: Reading two floating numbers upto three decimals
//            System.out.println("Enter first floating number: ");
//            double x = sc.nextDouble();
//            System.out.println("Enter second floating number: ");
//            double y = sc.nextDouble();
//            x = Math.round(x * 10000);
//            x = x / 10000;
//            y = Math.round(y * 10000);
//            y = y / 10000;
//            if(x==y)
//                System.out.println("They are same upto four decimal places");
//            else
//                System.out.println("They are different");

            // Question 10: Checking vowel or consonant
            System.out.println("Enter an alphaet: ");
            String ch = sc.next();
            boolean uppercase = ch.charAt(0)>=65 && ch.charAt(0)<=90;
            boolean lowercase = ch.charAt(0)>=97 && ch.charAt(0)<=122;
            boolean vowel = ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u");
            if(ch.length()>1)
                System.out.println("Error: Input an alphabet");
            else if (!(uppercase || lowercase))
                System.out.println("Not uppercase or lowercase: Please enter an alphabet");
            else if(vowel)
                System.out.println("You entered vowel");
            else
                System.out.println("You entered consonant");
    }    // end of main()
}      // end of class
