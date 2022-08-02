package Exception_Handling;
import java.util.Scanner;

public class Handling_Specific_Exception {
    public static void main(String[] args) {

        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 32;
        marks[2] = 65;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array index ");
        int index = sc.nextInt();
        System.out.print("Enter the number you wanna divide ");
        int num = sc.nextInt();

        try{
            System.out.println("The number at index["+index+"] is "+marks[index]);
            System.out.println("The value of "+marks[index]+"/"+num+" is "+marks[index]/num);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out OF Bounds Exception Occured");
        }
        catch(Exception e){
            System.out.println("Some other exception occured");
        }     // end of try-catch block

    }     // end of main()
}        //  end of program
