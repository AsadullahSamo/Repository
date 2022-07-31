package javaProgram;
import java.util.Scanner;

public class Ch2_Questions {
    public static void main(String[] args) {

        // Question 1
        float c = 7/4*9/2;        // 7/4=1 because both are integers then 1*9=9 then 9/2=4 because both
        System.out.println(c);   //    are integers and finally 4 is converted to float as 4.0 and printed
        float b = 7/4.0f*9/2.0f; // 7/4.0=1.75 because integer/float=float then 1.75*9=15.75 then
        System.out.println(b);  // 15.75/2.0=7.875 because both are float and result is 7.875

        // Question 2
        // Encrypting the grade
        char grade = 'A';
        grade = (char)(grade + 8);           // This is casting(conversion of one dataType to another)
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        // Question 3
        int x = 50;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int y = input.nextInt();
        boolean check = y>x;
        System.out.println(check);

        // Question 4
        int a=2, s=1, u=3, v=6;
        int exp = (v*v-u*u)/(2*a*s);
        System.out.println(exp);
    }
}
