package Strings;
import java.util.Scanner;

public class Vowels_Consonants_whitespaces_digits_in_string {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String text = input.nextLine();

        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        for(int i=0; i<text.length(); i++)
        {
            if(text.charAt(i)=='a' || text.charAt(i)=='e' ||text.charAt(i)=='i' || text.charAt(i)=='o' ||
               text.charAt(i)=='u' || text.charAt(i)=='A' || text.charAt(i)=='E' || text.charAt(i)=='I' ||
               text.charAt(i)=='O' || text.charAt(i)=='U')
            {
                vowels++;
            }
            else if(text.charAt(i)>='0' && text.charAt(i)<='9')
            {
                digits++;
            }
            else if (text.charAt(i)==' ')
            {
                spaces++;
            }
            else
            {
                consonants++;
            }     // end of if else
        }  // end of for

        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
        System.out.println("Digits: "+digits);
        System.out.println("Whitespaces: "+spaces);
    }
}
