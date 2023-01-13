package ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Neso_Academy_Question_01_and_02 {
    public static void main(String[] args) {

        // Question 01: Print below array concatenated with index of each element
        int [] arr = {5, 2, 2, 0};
        int i=0;
         for(int element: arr){
            System.out.println(element+" "+i);
            i++;
        }   // end of for Each loop

        String names = "Asad Junaid Awais Tariq";
        System.out.println(names.indexOf("Junaid"));

        ArrayList<String> name = new ArrayList<>();
        name.add("C++");
        name.add("Java");
        name.add("Python");
        name.add("SQL");
        name.add("Ruby");

        System.out.println(name);
        System.out.println("Index of Python is: "+name.indexOf("Python"));

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(15);
        l1.add(18);
        l1.add(9);
        l1.add(1);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        System.out.println("Index of 18 is: "+l1.indexOf(18));
        System.out.println(l1);


    }    // end of main()
}     // end of program
