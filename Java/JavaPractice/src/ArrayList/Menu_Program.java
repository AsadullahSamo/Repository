package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu_Program {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> integers = new ArrayList<>();
    static void show(){
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Your choice: ");
    }      // end of show() method
    static void display(ArrayList<Integer> integers){
        System.out.print("Your list: "+integers);
        System.out.println();
    }     // end of display() method
    static void addElement(){
            System.out.print("Enter an integer: ");
            int integer = sc.nextInt();
            integers.add(integer);
            System.out.println(integer + " is Added.");
    }     // end of addElement() method
    static void removeElement(){
        System.out.print("Enter an integer to remove: ");
        int rem_integer = sc.nextInt();
        if(integers.contains(rem_integer)) {
            int number = integers.indexOf(rem_integer);
            integers.remove(number);
            System.out.println(rem_integer+" is Removed ");
        } else {
            System.out.println("Not found.");
        }
    }    // end of removeElement() method


    public static void main(String[] args) {

         /* Question
            Create a menu program with the following options
            1. add element
            2. remove element
            3. display element
            4. Exit
            This program runs infinitely until the user chooses 4th option
          */
            try {
                show();
                int n;
                n = sc.nextInt();
                while (true) {
                    if (n == 1) {
                        addElement();
                        System.out.println();
                        show();
                    } else if (n == 2) {
                        removeElement();
                        System.out.println();
                        show();
                    } else if (n == 3) {
                        display(integers);
                        System.out.println();
                        show();
                    } else if (n == 4) {
                        System.out.println("Bye");
                        break;
                    } else if (n > 4 || n < 1) {
                        System.out.println("Please enter valid choice");
                        System.out.println();
                        show();
                    }
                    n = sc.nextInt();
                }   // end of while loop
            }    // end of try block
            catch (Exception ie){
                System.out.println("Please enter choice numbers");
            }   // end of catch block

    }      // end of main() method
}         //  end of program
