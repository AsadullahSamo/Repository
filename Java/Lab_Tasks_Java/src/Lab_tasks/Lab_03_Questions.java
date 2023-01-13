package Lab_tasks;
import java.util.Scanner;

public class Lab_03_Questions {
    public static void main(String[] args) {

        // Question 01: Printing odd and Even Series
        System.out.println("\nQuestion 01: Printing odd and Even Series using for loop");
        System.out.println("Odd\tEven");
        for(int i=1; i<=20; i++)
        {
            if(i%2!=0)
                System.out.print(i);
            else
                System.out.print("\t"+i+"\n");
        }
        System.out.println("Using while loop");
        int i=1;
        System.out.println("Odd\tEven");
        while(i<=20){
            if(i%2!=0)
                System.out.print(i);
            else
                System.out.print("\t"+i+"\n");
            i++;
        }


        // Question 02 (a): Printing alphabets
            System.out.println("\nQuestion 02 (a): Printing alphabets");
            for(i=65; i<=90; i++)
            {
                System.out.print((char)i+"  ");
            }


        // Question 02 (b): Printing ASCII values of alphabets
        System.out.println("\n\nQuestion 02 (b): Printing ASCII values of alphabets");
        for(i=0; i<=255; i++)
        {
            System.out.print((char)i+"  ");
        }

        // Question 03: Printing table
        System.out.println("\nQuestion 03: Printing table");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt();
        System.out.print("Enter starting number to print from: ");
        int start_value = sc.nextInt();
        System.out.print("Enter ending number to print table till this number: ");
        int end_value = sc.nextInt();

        for(i=start_value; i<=end_value; i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }

        // Question 04: Printing diamond
        // Upper pyramid
        System.out.println("Question 04: Printing Diamond");
        for(int rows=1; rows<=5; rows++)
        {
            for(int space=1; space<=5-rows; space++)
            {
                System.out.print(" ");
            }
            for(int cols=1; cols<=(2*rows)-1; cols++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower pyramid (thus combining both to form diamond)
        for(int rows=4; rows>=1; rows--)
        {
            for(int space=1; space<=5-rows; space++)
            {
                System.out.print(" ");
            }
            for(int cols=1; cols<=(2*rows)-1; cols++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }  // end of main() method
}   // end of class
