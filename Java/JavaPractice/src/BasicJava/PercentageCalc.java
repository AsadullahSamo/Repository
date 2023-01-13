package BasicJava;
import java.util.Scanner;

public class PercentageCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total marks: ");
        int total = input.nextInt();

        System.out.print("Enter marks of Islamic Studies: ");
        float marks1 = input.nextFloat();
        System.out.print("Enter marks of Physics: ");
        float marks2 = input.nextFloat();
        System.out.print("Enter marks of Chemistry: ");
        float marks3 = input.nextFloat();
        System.out.print("Enter marks of Mathematics: ");
        float marks4 = input.nextFloat();
        System.out.print("Enter marks of Java: ");
        float marks5 = input.nextFloat();
        float percentage = (marks1+marks2+marks3+marks4+marks5)*100/total;
        System.out.print("Percentage is: "+percentage);


    }
}
