package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Program {
    public static void main(String[] args) {
        // ArrayList is resizable Array (we can change, add, remove and set elements)
        // In angle brackets we put class name (Integer, Float, Byte e.t.c) not primitive data types (e.g int, short , float);
        ArrayList<Integer> l1 = new ArrayList<Integer>();
         l1.add(6);
         l1.add(7);
         l1.add(4);
         l1.add(6);
         l1.add(5);
         l1.add(0,9);
         l1.add(2,-5);
         // to print elements in ArrayList, we use for loop

        /* for(int i=0; i<l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }    // end of for loop */

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(50);
        l2.add(40);
        l2.add(30);
        System.out.println();
        l1.addAll(0, l2);
       /* for(int i=0; i<l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }    // end of for loop

        System.out.println(l1.contains(-7)); */
        // l2.remove(2);
        // l2.add(2, 30);
        // l2.set(1, 99);
        for(int i=0; i<l2.size(); i++)
        {
            System.out.println(l2.get(i));
        }
        System.out.println();

        // l1.removeAll(l2);
         for(int i=0; i<l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }    // end of for loop

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add(0, "Lemon");
        fruits.add("Orange");
        System.out.println(fruits);
        fruits.remove("Lemon");
        System.out.println(fruits);

        fruits.add("PineApple");
        fruits.add("Strawberry");
        Collections.sort(fruits);      // to sort array
        System.out.println("Using Collections.sort() to sort array  "+fruits);
    }     // end of main()
}        // end of program
