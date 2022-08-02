package Exception_Handling;
import java.util.Scanner;

public class Nested_Try_Catch {
    public static void main(String[] args) {

        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 32;
        marks[2] = 65;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome to iNTELLIj IDEA");
            try{

                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bounds");
                System.out.println("Welcome to level 2");
            }
        }
        catch(Exception e){
            System.out.println("Welcome to level 1");
        }


        while(true){
            System.out.println("Enter index");
            int index = sc.nextInt();
            try{
                System.out.println(marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Array index out of bounds");
            }
        }

    }       // end of main()
}          //  end of program
