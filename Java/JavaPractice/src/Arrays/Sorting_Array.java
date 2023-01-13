package Arrays;
import java.util.*;

public class Sorting_Array {
    public static void main(String[] args) {
        // Arrays.sort(array_name) is a method to sort array
        // Arrays.toString(array_name) is a method to display array

        // Question 1: Sorting array
        int sum=0, i, j;
        int [] arr = {1, 4, 87, 65, 91, 32, 456};
        String [] names = {"Asad", "Ubaid", "Junaid", "Awais", "Sajjad"};
        System.out.println("Original numeric array: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted numeric array: "+Arrays.toString(arr));

        System.out.println("Original alphabetic array: "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted alphabetic array: "+Arrays.toString(names));

        // Question 2: Adding array elements
        for(int array: arr)
        {
            sum += array;
        }
        System.out.println("The sum of array elements is "+sum);

        // Question 3: Printing grid
        for(i=1; i<=10; i++)
        {
            for(j=1; j<=10; j++)
            {
                System.out.print("- ");
            }
            System.out.println();
        }

        // Question 12: Finding duplicate element
        int [] arr2 = {1, 4, 56, 87, 56, 2, 3, 98, 4, 87};
        for(i=0; i<arr2.length; i++)
        {
            for(j=i+1; j<arr2.length; j++)
            {
                if(arr2[i]==arr2[j] && i!=j)
                {
                    System.out.println("Duplicate element: "+arr2[i]);
                }
            }   // end of inner for
        }   // end of outer for

        // Question 13: Finding duplicate string values
        String [] name = {"Asad", "Junaid", "Awais", "Sajjad", "Hassan", "Asad", "Sajjad"};
        for(i=0; i< name.length; i++)
        {
            for(j=i+1; j< name.length; j++)
            {
                if(name[i].equals(name[j]))
                {
                    System.out.println("Duplicate element: "+name[i]);
                }
            }
        }
        System.out.println("Hello, World!");
    }   // end of main()
}
