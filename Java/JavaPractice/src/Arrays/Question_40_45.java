package Arrays;
import java.util.*;

public class Question_40_45 {
    public static void main(String[] args) {
        // Question 41: Finding smallest and 2nd smallest element in an array
        int [] arr = {5, 7, -8, 5, 14, 1};
        System.out.println("From Question 41, Original Array: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println("Smallest element: "+arr[0]+" 2nd smallest element: "+arr[1]);

        // Question 42: Finding combination of four elements whose sum is equal to specific number
        int [] arr2 = {10, 20, 30, 40, 1, 2};
        int len = arr2.length;
        System.out.println("From Question 42: Combination of four elements whose sum is 53 are: ");
        for(int i=0; i<len-3; i++)
        {
            for (int j = 0; j < len - 2; j++)
            {
                for (int k = 0; k < len - 1; k++)
                {
                    for (int l = 0; l < len; l++)
                    {
                        if(arr2[i]+arr2[j]+arr2[k]+arr2[l]==53)
                        {
                            System.out.println(arr2[i]+" "+arr2[j]+" "+arr2[k]+" "+arr2[l]);
                        }
                    }
                }
            }
        }

    }      // end of main() function
}      // end of class
