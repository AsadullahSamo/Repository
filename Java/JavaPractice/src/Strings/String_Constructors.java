package Strings;

public class String_Constructors {
    public static void main(String[] args) {

        String str = "If someone throws stone at you, raise yourself such high that stone can't reach you";
        String str2 = "\nSheikh Ahmed Deedat was the lion of the stage";

        String s = new String();
        System.out.println(s);

        String s2 = new String("Asad");
        System.out.println(s2);

        char [] c1 = {'A', 's', 'a', 'd', ' ', 'S', 'a', 'm', 'o'};
        String s3 = new String(c1);
        System.out.println(s3);

        String s4 = new String(c1, 1, 5);
        System.out.println(s4);

        byte [] b1 = {74, 97, 118, 97};
        String s5 = new String(b1);
        System.out.println(s5);

        int [] i = {83, 99, 105, 101, 110, 99, 101};
        String s6 = new String(i, 1, 5);
        System.out.println(s6);


    }         // end of main() method
}            // end of program
