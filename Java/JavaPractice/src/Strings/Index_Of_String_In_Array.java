package Strings;
import java.util.Scanner;

public class Index_Of_String_In_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] str = {"Asad", "Junaid", "Awais", "  ", "Moiz", "Saad", "Noman", "Talha"};
        boolean isPresent = false;
        int index = 0;

        System.out.println("Enter a name to find in array ");
        String name = sc.nextLine();

        for(int i=0; i<str.length; i++){
            if(name.equals(str[i])){
                isPresent = true;
                index = i;
                break;
            }
        }   // end of for loop

        if(isPresent)
            System.out.println(name+" is found in array at index "+index);
        else
            System.out.println(name+" is not found in Array");
    }      // end of main() method
}         // end of program
