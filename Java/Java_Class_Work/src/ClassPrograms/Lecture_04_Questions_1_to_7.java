package ClassPrograms;
class Car{
    byte capacity;
    long engine_no;
    String cartype;
    String color;
//    @Override
//    public String toString(){
////        return "car1";
//    }
} // end of class Car



public class Lecture_04_Questions_1_to_7 {
    public static void main(String[] args) {

        // Question 01: Printing values of i and j
    /*  for(int i=0, j=10; i<=10; i++, j--)
        {
            System.out.println(i+"  "+j);
        } */

        // Question 02:
    /*  for(int i=0, j=10; i<=10; i++, j--)
        {
            if(i==5)
                break;
            System.out.println(i+"  "+j);
        } */

        // Question 03:
     /* for(int i=0, j=10; i<=10; i++, j--)
        {
            if(i==7)
                continue;
            System.out.println(i+"  "+j);
        } */

        // Question 04:
        /*  int i=0, j=10;
            while(i<=10)
            {
              System.out.println(i+"  "+j);
              i++;
              j--;
            }  */

        // Question 05:
     /*    int i=0, j=10;
        while(i<=10)
        {
            if(i==5)
                break;
            System.out.println(i+"  "+j);
            i++;
            j--;
        }   */

        // Question 06:
     /*   int i=0, j=10;
        while(i<=10)
        {
            if(i==7) {
                i++;
                j--;
                continue;
            }
            System.out.println(i+"  "+j);
            i++;
            j--;
        } */

        // Question 07:
        Car car1, car2;
        car1 = new Car();
        car1.capacity = 5;
        System.out.println(car1);     // this will print reference of object in memory
        car2 = new Car();
        System.out.println(car2);     // this will print reference of object in memory

            }    // end of main() method
        }       // end of class

