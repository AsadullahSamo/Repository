package Lab_06_Tasks;
import java.util.Scanner;

public class Lab_06_Task_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] array = {15, 27, 65, 98, 36, 51, 119, 42};
        System.out.print("Enter a number to search in array: ");
        int num = sc.nextInt();
        int index = 0;

        // initializing isPresent to false
        boolean isPresent = false;
        for(int i=0; i<array.length; i++){
            if(array[i]==num)
            {
                // if number is present, set isPresent to true and exit from loop
                isPresent = true;
                index = i;
                break;
            }
        }   // end of for loop

        // If number is found
        if(isPresent==true){
            System.out.println(num+" is found in array at index "+index);
        } else {
            System.out.println(num+" is not found in Array");
        }   // end of if else block

    }       // end of main() method
}          //  end of program
