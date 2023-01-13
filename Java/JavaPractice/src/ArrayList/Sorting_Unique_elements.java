package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting_Unique_elements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> elements = new ArrayList<>();
        System.out.println("Enter 10 elements: ");
        for(int i=0; i<10; i++){
            int temp = sc.nextInt();
            if(!elements.contains(temp)) {
                elements.add(temp);
            }
        }
        Collections.sort(elements);
        System.out.println(elements);

    }    // end of main() method
}        // end of program
