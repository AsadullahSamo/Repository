package Lab_05_Tasks;
import java.util.Scanner;

class Maths{
    public void addition(int num1, int num2){
        System.out.println(num1+"+"+num2+"="+(num1+num2));
    }
    public void sub(int num1, int num2){
        System.out.println(num1+"-"+num2+"="+(num1-num2));
    }
    public void multiply(int num1, int num2){
        System.out.println(num1+"*"+num2+"="+(num1*num2));
    }
    public void div(int num1, int num2){
        System.out.println(num1+"/"+num2+"="+(num1/num2));
    }

}      // end of class Maths
public class Lab_05_Task_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        Maths m1 = new Maths();
        m1.addition(num1, num2);
        m1.sub(num1, num2);
        m1.multiply(num1, num2);
        m1.div(num1, num2);

    }         // end of main() method
}            //  end of program
