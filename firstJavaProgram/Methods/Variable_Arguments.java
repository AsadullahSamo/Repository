package Methods;

public class Variable_Arguments {

//    static int sum(int a, int b){
//        return a+b;
//    }   // end of sum with two args
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }   // end of sum with three args
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }   // end of sum with four args

    // rather than all above methods we can use below method which perform all operations by all three above methods
      static int sum(int...arr){
          // Available as int [] arr
          int result = 0;
          for(int element: arr) {
              result += element;
          }
          return result;
      }      // end of sum with var args

      static int sum2(int a, int...arr){
          int result = 0;
          for(int element: arr) {
              result += element;
          }
          return result;
      }    // end of sum2   (Here at least one arg is required otherwise this will give error)

      public static void main(String[] args) {
        System.out.println("Welcome to var args tutorial");
//        System.out.println("The sum of 2 and 4 is: "+ sum(2,4));
//        System.out.println("The sum of 2, 6 and 4 is: "+ sum(2,6, 4));
//        System.out.println("The sum of 2, 5, 7 and 10 is: "+ sum(2,5, 7, 10));
//
        // Rather than creating these much overloaded methods we can use var arguments which pack all values as array and perform given operation
        System.out.println("The sum of 2 and 4 is: "+ sum(2,4));
        System.out.println("The sum of 2, 6 and 4 is: "+ sum(2,6, 4));
        System.out.println("The sum of 1, 2, 3, 4, 5, 6, 7 is: "+sum(1, 2, 3, 4, 5, 6, 7));
        System.out.println("The sum of nothing is: "+sum());
        // sum();     no error
        // sum2();     error because at least one arg is required
        // sum2(1); , sum2(1, 4, 5); and sum2(1, 6, 7, 9, 4, 3, 7); all are valid

    }   // end of main()
}    // end of class
