package javaProgram;

public class Literals {
    public static void main(String[] args) {
        // Literals in Java
        // --> The constant value assigned to the variables are called literals of that Data type
        // --> i.e long age=34;        here 34 is integer literal
        // --> char letter='A'         here A is character literal
        // --> float number=34.6f      here f is necessary as floating point is by default Double literal (otherwise its error like float number=34.6)

        byte range=126;                 // byte range=128 will give error because its range is -128 to 127, and it takes 1 byte
        short range1=4512;             // takes 2 bytes and ranges from -32,768 to 32,767
        int age=344589;               // takes 4 bytes and ranges from -2,147,483,648 to 2,147,483,647
        float f=34.6f;               // takes 4 bytes and ranges from 3.4X10^38 to 1.8X10^-45
        char ch='A';                //takes 2 bytes and ranges from 0 to 65,535
        long num=4545454546467484L; // takes 8 bytes and ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        double d=4578.56;         // takes 8 bytes and ranges from 1.7976931348623157 x 10308, 4.9406564584124654 x 10-324
        boolean expression=true;    // Depends on JVM and is True or False

        System.out.println(f);
        System.out.println(age);
        System.out.println(ch);
        System.out.println(num);
        System.out.println(range);
        System.out.println(range1);
        System.out.println(expression);
        System.out.println(d);

        String str="Asad";
        System.out.println(str);
    }
}
