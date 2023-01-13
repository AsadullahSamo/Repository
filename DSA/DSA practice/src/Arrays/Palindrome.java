package Arrays;

public class Palindrome {
    public static boolean palindrome(int num){
        int rev = 0, digit = num;
        do{
            digit = digit % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }while (num!=0);
        if (num == rev)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(palindrome(121));
    }
}
