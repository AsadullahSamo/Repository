package Access_Modifiers_and_Constructors;
import java.util.*;

class Game{
        public int number;
        public int inputNumber;
        public int noOfGuesses = 0;
        public void takeUserInput(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            inputNumber = sc.nextInt();
        }
        Game(){
            Random r = new Random();
             number = r.nextInt(100);
        }
        public void setNoOfGuesses(int noOfguesses){
            noOfGuesses = noOfguesses;
        }
        public int getNoOfGuesses(){
            return noOfGuesses;
        }
        boolean isCorrect(){
            noOfGuesses++;
            if(inputNumber==number){
                System.out.printf("You guessed it in %d attempts", noOfGuesses);
                return true;
            }
            else if (inputNumber>number){
                System.out.println("Lower the number!");
            }
            else if (inputNumber<number){
                System.out.println("Higher the number!");
            }
            return false;
        }

}       // end of class Game

public class Guess_the_Number {
    public static void main(String[] args) {
            /* Create a class Game, which allows the user to play "Guess the number" once, it should have
             the following methods */
            // 1. Constructor to generate random number
            // 2. takeUserInput() method to take user input
            // 3. isCorrect() method to check whether number entered by user is true or not
            // 4.getters and setters for noOfGuesses
            Game g = new Game();
            boolean b = false;
            while(!b) {
                g.takeUserInput();
                b = g.isCorrect();
            }   // end of while


    }   // end of main() function
}      // end of class
