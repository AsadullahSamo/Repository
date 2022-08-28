package javaProgram;

public class Resulting_data_types_and_Inc_Decrement_operators {
    public static void main(String[] args) {
        /*
        Resulting data type after arithmetic operation
            Result = byte + short -> integer
            Result = short + integer -> integer
            Result = long + float -> float
            Result = integer + float -> float
            Result = character + integer -> integer
            Result = character + short -> integer
            Result = long + double -> double
            Result = float + double -> double`
        */
        int i = 56;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int y = 7;
        System.out.println(++y*8);          // 8*8=64
        char ch = 'A';
        System.out.println(ch++);          // First it prints A then
        System.out.println(ch);          // due to increment prints B
    }

}
