import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int guessNumber, secreteNumber;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        guessNumber = keyboard.nextInt();
        secreteNumber = 1 + rand.nextInt(10);
        while (secreteNumber !=  guessNumber){

            System.out.println("Your Guess is " + guessNumber + ". That is not correct. Try again");
            guessNumber = keyboard.nextInt();

        }

        if (secreteNumber == guessNumber)
        System.out.println("Yor Guess is "+ guessNumber + ". That is correct." + " My number was " + secreteNumber + ".");
    }
}
