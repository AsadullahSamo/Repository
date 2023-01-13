package ClassPrograms_Lecture_13_to_24;
class Square extends Thread{
    @Override
    public void run(){
        int area;
        for (int i=1; i<=100; i++){
            area = i*i;
            System.out.println("The area of square "+i+" is "+area);
        } // end of for loop
    }    // end of run() method
}       // end of class Square

public class Question_01 {
    public static void main(String[] args) {

//         Question 01:
//        Create a program to generate 100 squares area in a separate thread
//        100 squares side increase by 1
//        1st square 1X1, 2nd square 2X2 and so on...

        Square s = new Square();
        s.start();

    }      // end of main() method
}         //  end of program
