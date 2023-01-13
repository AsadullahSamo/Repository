package Strings;
import java.util.*;

public class Question_1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 01: Getting character at given Index  (0 and 10 in this case)
        String str = "Java Exercises";
        System.out.println("The character at position 0 is: "+str.charAt(0));
        System.out.println("The character at position 10 is: "+str.charAt(10));
        System.out.println(str);

        // Question 05: Comparing two Strings
        String str1 = "This is exercise 1";
        String str2 = "This is exercise 2";
        System.out.print("Question 5: ");
        int result = str1.compareTo(str2);
        if(result < 0)

            System.out.println("String1 is less than String 2");
        else if(result==0)
            System.out.println("Strings are equal");
        else  //if(result>0)
            System.out.println("String1 is greater than String 2");

        // Question 06: Comparing two Strings
        String str3 = "This is exercise 1";
        String str4 = "This is exercise 1";
        System.out.print("Question 6: ");
        if(str3.equalsIgnoreCase(str4))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        // Question 7: Concatenate a given string to the end of another string
        String str5 = "PHP exercises and ";
        String str6 = "Python exercises";
        System.out.println("Question 7: Strings after concatenating are: "+str5.concat(str6));

        // Question 8: checking if a given word is present in string OR not (and in this case)
        String str7 = str5.concat(str6);
        if(str7.contains("and"))
            System.out.println("Question 8: "+str7+" contains and");
        else
            System.out.println("Question 8: "+str7+" does not contain and");

        // Question 12: Comparing ending characters of string
        String str8 = "Python exercises";
        String str9 = "PHP exercises";
        if(str8.endsWith("se") && str9.endsWith("se"))
            System.out.println("Question 12: Both strings ends with se");
        else
            System.out.println("Question 12: Both strings does not end with se");

        // Question 13: Printing current date and time
           Calendar c = Calendar.getInstance();
            System.out.println("Question 13: Current Date and Time");
            System.out.printf("%tB %te, %tY%n", c, c, c);
            System.out.printf("%tl:%tM %tp%n", c, c, c);


    }     // end of main
}       // end of class
