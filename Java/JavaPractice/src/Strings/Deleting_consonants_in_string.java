package Strings;

public class Deleting_consonants_in_string {
    public static void main(String[] args) {
        String text = "Hello, have a good day";

       //String text1 = "";
       String text1 = text.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]","");

        System.out.println("Result is: "+text1);

    }  // end of main function
} // end of class
