package Strings;
import java.util.Scanner;

public class Length_of_string {
    public static void main(String[] args){
        // Question 1: finding length of word 'refrigerator'
        String content = "refrigerator";
        System.out.println(content.length());

        // Question 2: Finding letter 'e' in Umbrella
        String thing = "Umbrella";
        boolean check = false;
        for(int i=0; i<thing.length(); i++)       // i=0    thing.length=8
        {
            if(thing.charAt(i)=='e')
            {
                check = true;
                break;
            } // end of if else
        } // end of for
        System.out.println(check);
        // Question 2: or e in umbrella can be found as
        String word = "Umbrella";
        if(word.indexOf('l')!=-1)
        {
            System.out.println("letter found at index ["+word.indexOf('l')+"]");
        }
        else
        {
            System.out.println("l not found");
        }

        // Question 3: Finding word "orange" in sentence "This is orange juice"
        String text = "This is orange juice";
        if(text.contains("orange"))      // means if index is found (if value is not false)
        {
            System.out.println("Word found at index ["+text.indexOf("orange")+"]");
        }
        else
        {
            System.out.println("Word not found");
        }

        // Question 4: Finding first and last occurrence of 'o' and ','
        String line = "Hello, World";
        System.out.println("First occurrence of o is at index ["+line.indexOf('o')+"]");
        System.out.println("Last occurrence of o is at index ["+line.lastIndexOf('o')+"]");
        System.out.println("Index of , is ["+line.indexOf(',')+"]");
        String ch = "Character";


    }  // end of main()

} // end of class
