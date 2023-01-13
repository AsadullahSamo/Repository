package Strings;

public class Question_16_25 {
    public static void main(String[] args){
        // Question 16: Getting index of all the alphabets in a string
        String str = "The quick brown fox jumps over a lazy dog";
        for(int i=0; i<str.length(); i++)
        {
            System.out.println(str.indexOf("abcdefghijklmnopqrstuvwxyz"));
        }

    }     // end of main()
}      // end of class
