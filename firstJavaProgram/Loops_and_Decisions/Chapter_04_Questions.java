package Loops_and_Decisions;
import java.util.Scanner;

public class Chapter_04_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1:
//        int a = 10;
//        if(a=11){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }  // end of if else
        // It is error cause a=11 in if is not valid

        // Question 2: Finding pass or fail by percentage
        int phy, chem, math;
        float percentage;
        System.out.println("Enter marks of physics");
        phy = sc.nextInt();
        System.out.println("Enter marks of chemistry");
        chem = sc.nextInt();
        System.out.println("Enter marks of mathematics");
        math = sc.nextInt();
        percentage = (phy+chem+math)*100/300;

        if(phy>=33 && chem>=33 && math >= 33 & percentage>=40.0)
        {
            System.out.println("Your percentage is "+percentage+" and you are Pass");
        }
        else
        {
            System.out.println("Your percentage is "+percentage+" and you are Fail");
        }

        // Question 3: Calculating income tax
        System.out.print("Enter your income slab: ");
        int slab = sc.nextInt();
        if(slab>=250000 || slab<50000){
            System.out.println("Tax: 5%");
        }
        else if(slab>=500000 || slab<=100000){
            System.out.println("Tax: 10%");
        }
        else if(slab>=100000){
            System.out.println("Tax: 20%");
        }
        // Question 4: Calculating days of week by number i.e 1 for monday, 2 for tuesday and so on
        System.out.print("Enter number from [1-7] to see day: ");
        int num = sc.nextInt();

        switch(num){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid! please enter number from [1-7]");
        }

        // Question 5: Checking leap year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if(year%4==0)
        {
            System.out.println("Its leap year");
        }
        else
        {
            System.out.println("Its not leap year");
        }

        // Question 6: Detecting type of website from URL i.e. pk->pakistani, .org->organisation, .com->commercial
        System.out.print("Enter website name: ");
        String str = sc.nextLine();

        if(str.endsWith(".com"))
        {
            System.out.println("You entered a commercial website name ");
        }
        else if(str.endsWith(".org"))
        {
            System.out.println("You entered a organisation website name ");
        }
        else if(str.endsWith(".pk"))
        {
            System.out.println("You entered a Pakistani website name ");
        }
        else
        {
            System.out.println("Invalid URL name");
        }


    } // end of main
}    // end of class
