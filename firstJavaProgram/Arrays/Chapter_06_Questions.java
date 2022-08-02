package Arrays;
import java.util.Scanner;

public class Chapter_06_Questions {
    public static void main(String[] args) {

        // Question 1: Calculating sum of array of five floats
            float [] points = {15.6f, 45.7f, 25.02f, 79.54f, 65.18f};
            float sum = 0.0f;
            //Method 1.  Using for loop to calculate sum
            for(int i=0; i<points.length; i++)
            {
                sum += points[i];
            }
        System.out.println("Using for loop Sum is "+sum);
        // Method 2. Using for each loop to calculate sum
        sum=0;
        for(float element: points)
            {
                sum += element;
            }
        System.out.println("Using for each loop Sum is "+sum);

        // Question 2: Checking if given integer is present in array or not
        Scanner sc = new Scanner(System.in);
        int [] marks = {45, 87, 65, 90, 95};
        System.out.print("Enter an integer to find if it's present in array or not: ");
        int num = sc.nextInt();
        boolean isPresent = false;
        for(int i=0; i< marks.length; i++)
        {
            if(num==marks[i])
            {
                isPresent = true;
                break;
            }
        }   // end of for loop
        if(isPresent)              // Same as if(isPresent==true)
        {
            System.out.println("Number is found");
        }
        else
        {
            System.out.print("Number not found\n");
        }

        // Question 3: Calculating average of marks
            sum=0;
            int [] phyMarks = {45, 55, 65, 75, 85};
            for(int mark: phyMarks)
            {
                sum += mark;
            }
            float avg = sum/ phyMarks.length;
            System.out.println("Average of physics marks is "+avg);

        // Question 4: Adding two matrices of size 2X3;
        int [][] matrix1 = new int [2][3];
        int [][] matrix2 = new int [2][3];
        System.out.print("Enter first matrix: ");
        for (int i=0; i< matrix1.length; i++)
        {
            for (int j=0; j< matrix1[i].length; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter second matrix: ");
        for (int i=0; i< matrix2.length; i++)
        {
            for (int j=0; j< matrix2[i].length; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.print("Sum of two matrices is\n");
        for (int i=0; i< matrix1.length; i++)
        {
            for (int j=0; j< matrix1[i].length; j++)
            {
                System.out.print(matrix1[i][j]+matrix2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

            // Question 5: Reversing an array
            int [] arr = {1, 2, 3, 4, 5, 6};
            int n = Math.floorDiv(arr.length, 2);         // to find the greatest integer where the greatest integer means(5/2=2.5 here greatest integer is 2, 6/2=3 -> is greatest integer)
            int l = arr.length, temp;
            System.out.println("Original array");
        for(int i=0; i<l; i++)
        {
            System.out.print(arr[i] + "  ");
        }

        for(int i=0; i<n; i++)        // Loop till the greatest integer
        {
            // Swap arr[i] with arr[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        System.out.println("\nArray after reversing");
        for(int element: arr)
        {
            System.out.print(element+" ");
        }

         // MIN_VALUE and MAX_VALUE methods()
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        // Question 6: Finding maximum element in an array
        int [] arr2 = {4, 5, 78, 98, 65, 70};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr2.length; i++)
        {
            if(arr2[i]>max)
            {
                max = arr2[i];
            }
        }
        System.out.println("Max is "+max);

        // Question 7: Finding minimum element in an array
        int [] arr3 = {4, 5, 78, 98, 65, 701, -5};
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr3.length; i++)
        {
            if(arr3[i]<min)
            {
                min = arr3[i];
            }
        }
        System.out.println("Min is "+min);

        // Question 8: Sorting array
        int [] arr4 = {4, 5, 78, 98, 65, 701, -5};
        int sort;
        // Original array
        System.out.println("Original array\n");
        for(int i=0; i<arr4.length; i++)
        {
            System.out.print(arr4[i]+"  ");
        }
        // Sorting array
        System.out.println("\nArray in ascending order is\n");
        for(int i=0; i<arr4.length; i++)
        {
            for(int j=i+1; j< arr4.length; j++)
            {
                if (arr4[i] > arr4[j])
                {
                    sort = arr4[i];
                    arr4[i] = arr4[j];
                    arr4[j] = sort;
                }
            }
            System.out.print(arr4[i]+" ");
        }

    }     // end of main()
}     // end of class
