package Arrays;

public class Question_22_to_27 {
     static void equality_check(int[] arr1, int[] arr2){       // Function for Question 23 to check equality of two arrays
        boolean b1 = true;
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i]!=arr2[i]) {
                b1 = false;
                break;
            }
        }
            if(b1)
            {
                System.out.println("Two arrays are equal");
            } else
            {
                System.out.println("Two arrays are not equal");
            }
        }      // end of equality_check function

    static void common_elements(int [] arr1, int [] arr2, int [] arr3){
        System.out.print("Common elements from three sorted arrays : ");
        for (int value : arr1) {
            for (int i : arr2) {
                for (int j : arr3) {
                    if (j == value && j == i) {
                        System.out.print(j + "  ");
                    }
                }
            }
        }     // end of outer loop
        System.out.println();
    }    // end of common_elements function

    // main function
    public static void main(String[] args) {
        // Question 22:   Finding all pairs of elements whose sum is equal to specific number
        int [] arr = {2, 7, 4, -5, 11, 5, 20};
          int i, j;
        System.out.println("Pairs of elements and their sum: ");
        for(i=0; i<arr.length; i++)
        {
            for(j=0; j<arr.length; j++)
            {
                if(arr[i]+arr[j]==15)
                System.out.println(arr[i]+"+"+arr[j]+"=15");
            }  // end of inner loop
        }   // end of outer loop

        // Question 23: Checking equality of two arrays
        int [] arr1 = {2, 5, 7, 9, 11};
        int [] arr2 = {2, 5, 7, 8, 11};
        int [] arr3 = {2, 5, 7, 9, 11};

        equality_check(arr1, arr2);      // Function call
        equality_check(arr1, arr3);     //  Function call

        // Question 24: Finding missing number in an array
        int [] arr4 = {1, 2, 3, 4, 6, 7};
        int total_num = 7, num_sum=0;
        int expected_num_sum = total_num * ((total_num + 1) / 2);
        for(i=0; i<arr4.length; i++)
        {
            num_sum +=arr4[i];
        }
        System.out.println("Missing number: "+(expected_num_sum-num_sum));

        // Question 25: Finding common elements from three sorted arrays;
        int [] arr5 = {2, 4, 8};
        int [] arr6 = {2, 3, 4, 8, 10, 16};
        int [] arr7 = {4, 8, 14, 40};
        int [] arr8 = {2, 4, 8};
        common_elements(arr5, arr6, arr1);
        equality_check(arr5, arr8);
        common_elements(arr5, arr6, arr7);

        // Question 27: Finding number of even and odd integers in an array
        int [] arr9 = {5, 7, 2, 4, 9};
        int  even=0, odd=0;
        for (int l : arr9) {
            if (l % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of even integers: "+even);
        System.out.println("Number of odd integers: "+odd);

    }     // end of main()
}     // end of class
