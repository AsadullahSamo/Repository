package Methods;
public class Method_Sum {
    public static void sum(int x, int y){
        int z = x+y;
        System.out.println(z);
    } // end of sum()
    static void change1(int n){
        int x = 45;
    } // end of change1
    static void change2(int [] arr){
        arr[0] = 47;
    } // end of change2

    public static void main(String[] args) {

        int a=5, b=7;
        int a1=3, b1=8;
        sum(a, b);
        sum(a1, b1);
        // if we don't make our void static like (if we made "static void sum" as "void sum" ) then we have to first
        // create its object and then call by its object like
        // Method_Sum obj = new Method_Sum();
        // obj.sum(a, b);

        // Note: In case of arrays the reference is passed so change is reflected in main (Below is given example)

        // Case 1: Changing integer (The value is not changed in this case b/c copy of x is passed to the function not the address)
        int x = 48;
        System.out.println("Before function call, The value of x is: "+x);
        change1(x);
        System.out.println("After function call, The value of x is: "+x);

        // Case 2: Changing the Array(It will be changed due to reference of its elements will be passed)
        int [] arr = {12, 45, 78, 98, 65, 32};
        System.out.println("Before function call, The value of element at index 0 is: "+arr[0]);
        change2(arr);
        System.out.println("After function call, The value of element at index 0 is: "+arr[0]);

    }  // end of main()
}    // end of class
