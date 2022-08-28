package ClassPrograms;

import java.util.Scanner;

class University2{

    String name;
    String uniName;
    static class Student2 {
        University2 u2 = new University2();
        String temp1 = u2.name;
        String temp2 = u2.uniName;

    public void print(Student2[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Name of student " + (i + 1) + " is " + arr[i].temp1);
            System.out.println("Name of university of student " + (i + 1) + " is " + arr[i].temp2);
        }    // end of for loop
    }     // end of print
}     // end of Student2
}      // end of class University2

public class Lecture_08_Question {

    public static void main(String[] args) {
        University2.Student2 [] arr = new University2.Student2[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< arr.length; i++)
        {
            arr[i] = new University2.Student2();
            System.out.println("For student "+(i+1));
            System.out.print("Enter name: ");
            arr[i].temp1 = sc.nextLine();
            System.out.print("Enter university name ");
            arr[i].temp2 = sc.nextLine();
        }

        University2.Student2 s2 = new University2.Student2();
        s2.print(arr);

    }   // end of main() method
}      // end of Program

