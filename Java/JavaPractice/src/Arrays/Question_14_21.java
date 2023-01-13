package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Question_14_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 14: Finding common elements between two matrices
          int i, j;
        String [] mat1 = {"Python", "Java", "C++", "C#", "PHP", "SQL"};
        String [] mat2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
//            By Taking input from user
//          String [] mat1 = new String[4];
//          String [] mat2 = new String[5];
//        System.out.println("Enter First matrix");
//        for(i=0; i<mat1.length; i++)
//        {
//            mat1[i] = sc.next();
//        }
//        System.out.println("Enter Second matrix");
//        for(i=0; i<mat2.length; i++)
//        {
//            mat2[i] = sc.next();
//        }
        // Comparing two matrices to get common elements
        for(i=0; i<mat1.length; i++)
        {
            for(j=0; j<mat2.length; j++)
            {
                if (mat1[i].equalsIgnoreCase(mat2[j]))
                {
                    System.out.println("Common element: "+mat2[j]);
                }
            }    // end of inner for loop
        }    // end of outer for loop

        // Question 15: common elements between two arrays of integer elements
            int [] arr1 = {1, 2, 5, 5, 8, 9, 7, 10};
            int [] arr2 = {1, 0, 6, 15, 6, 4, 7, 0};
        for(i=0; i<arr1.length; i++)
        {
            for(j=0; j<arr2.length; j++)
            {
                if (arr1[i]==arr2[j])
                {
                    System.out.println("Common element: "+arr2[j]);
                }
            }    // end of inner for loop
        }    // end of outer for loop

            // Question 17: Finding 2nd largest element and 2nd smallest element in an array
            int [] arr3 = {1, 5, 78, 45, 68, 76, 99};
            System.out.println("Original array: "+Arrays.toString(arr3));
            int max = Integer.MIN_VALUE;
        // Sorting then printing 2nd last value as it'll be second-largest value
            // Sorting array in ascending order
            for(i=0; i<arr3.length; i++)
            {
                for(j=i+1; j<arr3.length; j++)
                {
                    if(arr3[i]>arr3[j] && i!=j)
                    {
                       int temp = arr3[i];
                        arr3[i] = arr3[j];
                        arr3[j] = temp;
                    }
                }
            }
            // Printing sorted array
            System.out.println("Sorted array: ");
            for(i=0; i<arr3.length; i++)
            {
                System.out.print(arr3[i]+"  ");
            }
            System.out.println();
            //   Printing second-largest element
            System.out.println("Second largest element in array "+Arrays.toString(arr3)+" is "+arr3[arr3.length-2]);
            System.out.println("Second smallest element in array "+Arrays.toString(arr3)+" is "+arr3[1]);

    }      // end of main()
}      // end of class
