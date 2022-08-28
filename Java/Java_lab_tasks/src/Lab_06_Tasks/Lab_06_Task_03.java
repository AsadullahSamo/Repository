package Lab_06_Tasks;
import java.util.Scanner;

public class Lab_06_Task_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float sum = 0;

        for(int i=0; i< args.length; i++){
             float f = Float.valueOf(args[i]);
             sum = sum + f;
        }
        System.out.println("Average is "+sum/5);

    }        // end of main() method
}           //  end of program
