package Arrays;
import java.util.*;

public class Question_28_32 {

    static void sort(int [] arr){
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }     // end of sort function

        // main function
    public static void main(String[] args) {

        int i, j;
            // Question 28: Getting difference of largest and smallest element
            int [] arr = {21, 4, 7, 8, 9, 68, 12};
            // Sorting array in ascending order
            sort(arr);
            System.out.println("From Question 28: Array after sorting in ascending order: "+Arrays.toString(arr));
            // Printing difference of largest and smallest element
            int diff = arr[arr.length-1] - arr[0];
            System.out.println("Difference between largest and smallest element is: "+diff);

            // Question 29: Computing average of all integers in an array except its largest and smallest value
            int [] arr2 = {5, 7, 2, 4, 9};
            // Sorting arr2 and printing
            sort(arr2);
            System.out.println("From Question 29: Array after sorting in ascending order: "+Arrays.toString(arr2));
            // Computing average
            int sum=0;
            for(i=0; i<arr2.length; i++)
            {
                    if(arr2[i]==arr2[0] || arr2[i]==arr2[arr2.length-1])
                        continue;
                    else
                        sum += arr2[i];
            }
            float avg = (float)sum/(arr2.length-2);
            System.out.println("Average of integers except smallest and largest integer: "+avg);

            // Question 30: Checking array of integers if it is without 0 and -1 OR not
            int [] arr3  = {50, 77, 12, 54, -11};
            boolean b1 = true;
            System.out.println("From Question 30: Original array: "+Arrays.toString(arr3));
            for(i=0; i<arr3.length; i++)
            {
                if(arr3[i]==0 || arr3[i]==-1)
                    b1 = false;
            }
            if(b1)
                System.out.println("True: Array does not contain 0 or -1");
             else
                System.out.println("False: Array contains 0 or -1");

            // Question 31: Checking if sum of all 10's in array is 30 or not
            int [] arr4 = {10, 77, 10, 54, -11, 10};
                sum = 0;             // we did not write as (int sum=0) because we declared it in Line:40, but we initialize it here to zero as (sum=0)
                for(i=0; i<arr4.length; i++)
                {
                   if(arr4[i]==10)
                       sum += 10;
                }
                if(sum==30)
                    System.out.println("From Question 31: Sum is 30: True");
                else
                    System.out.println("From Question 31: Sum is not 30: False");

                // Question 32: Checking if array contains 65 and 77 OR not
        int [] arr32  = {77, 77, 65, 65, 65, 77};
        boolean b2 = false, b3 = false;
        System.out.println("From Question 32: Original array: "+Arrays.toString(arr32));
        for(i=0; i<arr32.length; i++)
        {
            if(arr32[i]==77)
                b2 = true;
            else if(arr32[i]==65)
                b3=true;
        }
        if(b2 && b3)
            System.out.println("True: 65 and 77 is present in array "+Arrays.toString(arr32));
        else if(b2 && !b3)
            System.out.println("False: 77 is present but 65 is not present in array "+Arrays.toString(arr32));
        else if(!b2 && b3)
            System.out.println("False: 65 is present but 77 is not present in array"+Arrays.toString(arr32));

    }  // end of main()
}    // end of class
