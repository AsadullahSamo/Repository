package javaProgram;

public class Operators {
    public static void main(String[] args){

        // Bitwise operators (&, |)
        // --> first converts numbers into binary form then perform operation like
        /*

        let  A=2, b=3; then          in binary 2=10          , 3=11

            & (bitwise and)	        10
            1&1=1 because         & 11       0&1=0 because one condition is false
            both are true         -----
                                    10      which is binary value for 2

            | (bitwise or)	        10
            1&1=1 because         | 11       0&1=0 because one condition is true
            both are true         -----
                                    11      which is binary value for 3

            ^ (bitwise XOR)	        10
            1&1=0 because         ^ 11       0&1=1 because true is odd times
            true is even times    -----
                                    01      which is binary value for 1

        << (left shift)	This operator moves the value left by the number of bits specified.
        int m = 1 << 3;   // In binary: 1 to 1000
        println(m);  // Prints "8"
        int n = 1 << 8;   // In binary: 1 to 100000000
        println(n);  // Prints "256"
        int o = 2 << 3;   // In binary: 10 to 10000
        println(o);  // Prints "16"
        int p = 13 << 1;  // In binary: 1101 to 11010
        println(p);  // Prints "26

        >> (right shift)	This operator moves the value right by the number of bits specified.
        int m = 8 >> 3;    // In binary: 1000 to 1
        println(m);  // Prints "1"
        int n = 256 >> 6;  // In binary: 100000000 to 100
        println(n);  // Prints "4"
        int o = 16 >> 3;   // In binary: 10000 to 10
        println(o);  // Prints "2"
        int p = 26 >> 1;   // In binary: 11010 to 1101
        println(p);  // Prints "13"   */
        int a=2, b=3;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(a<<b);
        System.out.println(a>>b);

    }
}
