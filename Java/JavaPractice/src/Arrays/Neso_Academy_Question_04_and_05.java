package Arrays;

import java.util.Arrays;

public class Neso_Academy_Question_04_and_05 {
    public static void main(String[] args) {

//        Question 04: Find max and min element from an array
//        Done already
//        Question 05: Write a program to place odd elements of an array before even elements

        int [] arr = {1, 2, 4, 5, 7, 9, -2, 3};
        int [] temp = new int[arr.length];
        int j = 0;
        int k = arr.length - 1;

        for(int i=0; i< arr.length; i++){
            if(arr[i]%2!=0)
            temp[j++] = arr[i];
            else
            temp[k--] = arr[i];
        }
        System.out.println(Arrays.toString(arr));

    }   // end of main() method
}      // end of program
