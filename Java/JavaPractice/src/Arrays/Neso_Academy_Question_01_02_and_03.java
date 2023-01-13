//package Arrays;
import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Neso_Academy_Question_01_02_and_03 {
    static Scanner sc =  new Scanner(System.in);
    static void fillArrayOfNumbers(int [] numbers){
        for(int i=0; i< numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
    }
    static void printArrayOfNumbers(int [] numbers){
        System.out.print("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }
    static void fillArrayOfPoints(Point [] points){
        for(int i=0; i< points.length; i++){
            System.out.print("For point " + (i+1) + " Enter x and y: ");
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }
    }
    static void printArrayOfPoints(Point [] points){
        System.out.print("The points are: ");
        for(int i=0; i< points.length; i++){
            System.out.println("("+points[i].x+", "+points[i].y+")");
        }
    }
    static void occurrence(int [] array, int element){
        int occurrence = 0;
        for(int i=0; i< array.length; i++){
                if(array[i]==element)
                    occurrence++;
            }
        System.out.println(element+" occurs "+occurrence+" times");
        }   // end of method occurrence

    public static void main(String[] args) {

        //        Question 01: Write a program that fills an array with n integers entered by the user
//            System.out.print("How many elements? Max is 20: ");
//            int range = sc.nextInt();
//            while(range<1 || range>20){
//                System.out.println("Invalid range!");
//                range = sc.nextInt();
//            }
//            int [] numbers = new int[range];
//            fillArrayOfNumbers(numbers);
//            printArrayOfNumbers(numbers);
//
//            Point [] p = new Point[range];
//            fillArrayOfPoints(p);
//            printArrayOfPoints(p);

//            Question 02: Sum product and average of Array
//        int [] arr = {1, 2, -3, 5, 7};
//        int sum = 0, product = 1;
//        for(int i=0; i< arr.length; i++){
//            sum += arr[i];
//            product *= arr[i];
//        }    // end of for loop
//        System.out.println("sum = "+sum+", product = "+product+", average ="+(float)sum/arr.length);

//        Question 03: Write a program that displays number of occurrences of an element in the Array
        int [] array = {1, 1, 1, 2, 3, 4};
        occurrence(array, 1);
        occurrence(array, 3);
        occurrence(array, 7);

    }      // end of main() method
}         //  end of program
