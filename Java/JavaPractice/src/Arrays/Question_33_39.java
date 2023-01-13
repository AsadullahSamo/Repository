package Arrays;
import java.util.*;

public class Question_33_39 {
    public static void main(String[] args) {
        // Question 35: Find index of two elements whose sum is equal to specific number (i.e. 6, 13)
        int i, j, k;
        int [] arr = {1, 2, 4, 5, 6};
        for(i=0; i<arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (j != i && arr[i] + arr[j] == 6) {
                    System.out.println("Index: " + i + " Index: " + j);
                    break;
                }
            }
        }

        // Question 37: Creating array by its elements
        System.out.println("From Question 36");
        int [] arr2 = {10, 20, 30};
        int [] arr3 = {50, 60, 70};
        int [] arr4 = {90, 100, 110};
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        System.out.println("["+arr2[0]+"]");
        System.out.println("["+arr2[1]+", "+arr3[0]+"]");
        System.out.println("["+arr2[2]+", "+arr3[1]+", "+arr4[0]+"]");
        System.out.println("["+arr3[2]+", "+arr4[1]+"]");
        System.out.println("["+arr4[2]+"]");

        // Question 39: Getting the LEADERS elements from given array
        int  [] arr5 = {10, 9, 14, 23, 15, 0, 9};
        int size = arr5.length;
        for(i=0; i<size; i++)
        {
            for(j=i+1; j<size; j++)
            {
                if(arr5[i]<=arr5[j])
                    break;
            }
            if(j==size)
                System.out.print(arr5[i]+" ");
        }



    }     // end of main() function
}     // end of class
