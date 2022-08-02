package Strings;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Asad";
        System.out.println(name);

        //length(), toLowerCase() and toUpperCase() methods
        int value = name.length();        // this function returns length of string (an integer value)
        System.out.println(value);
    //or can be written as "System.out.println(name.length());" without assigning it to new string

        String lowercase = name.toLowerCase(); //this function converts entire string ("name") to lowercase
        System.out.println(lowercase);
    //or can be written as "System.out.println(name.toLowerCase())"; without assigning it to new string

        String uppercase = name.toUpperCase(); //this function converts entire string ("name") to uppercase
        System.out.println(uppercase);
    //or can be written as "System.out.println(name.toUpperCase());" without assigning it to new string

        // trim() method
        String nonTrimmedString = "    Asad    ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim(); // this function removes all whitespaces from string
        System.out.println(trimmedString);
    //or can be written as "System.out.println(nonTrimmedString.trim())";

        // substring(int start index) methods--> this prints string from given index to end (index starts from 0)
        String name2 = "Junaid";       // in this J is at index 0, u at index 1 and so on
        System.out.println(name2.substring(3));   // prints aid  (cause 2 is index for n)
        System.out.println(name2.substring(0));      //In this case it prints whole original string
        //substring(start index, end index)-->prints from given to end index (start index includes, end index excludes)
        System.out.println(name2.substring(1,3));    // prints un (cause 1 is index for u and 3 is index for a which will be excluded)
        System.out.println(name2.substring(1,6));   // prints till end because final index is 5, and we said exclude 6 so till 5 it'll get print

        // replace(char, char)--> takes 2 chars and replace first char with second
        String name3 = "Harry";
        System.out.println(name3.replace('r', 'p')); // all 'r' from name3 string is replaced by 'p'
        // replace(string, string)--> takes 2 strings and replace first string with second
        System.out.println(name3.replace("rry", "ris"));
        System.out.println(name3.replace("r","ris")); //Both r from name3=harry will be replaced by ris

        // startsWith(), endsWith(), equals() and equalsIgnoreCase() methods--> all these methods take a string and return boolean value (true or false)
        String name4 = "Rasheed";
        System.out.println(name4.startsWith("Ras"));
        System.out.println(name4.endsWith("ip"));
        System.out.println(name4.equals("Rasheed")); // this method is recommended whenever we want to check if strings are equal or not (instead of == operator)
        System.out.println(name4.equalsIgnoreCase("raSHeEd"));
        // System.out.println(name4.startsWith('R'));           // this will give error as these methods don't take char

        // charAt()--> (take int and returns char at given index) ,indexOf() and lastIndexOf-->(take char and returns index of given char in int) methods
        String name5 = "Naeem";
        System.out.println(name5.charAt(1)); // prints e because 1 is index for a
        System.out.println(name5.indexOf('e'));       // prints 0 because first e is at index 2
        System.out.println(name5.indexOf("ee"));       // prints index from starting char here 2
        System.out.println(name5.indexOf('j'));  //(if index is not found it'll return -1)
        String line = "Java is a programming language";
        System.out.println(line.indexOf('a',8));      // Search a from index 8 and return its index
        System.out.println(line.lastIndexOf('i'));       // Search i which is at last and print its index
        System.out.println(line.lastIndexOf('a',14));// Search for first 14 chars and if 'a' is present in these first 14 chars give its index from last
    }
}
