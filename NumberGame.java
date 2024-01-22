package COdEWAY;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

   public static void main(String[] args) {
       
       Random rand = new Random();
       int guessNumber=rand.nextInt(100);
       int numberOfTries=0;
       Scanner sc= new Scanner(System.in);
       int guess;
       boolean win =false;

       while(win==false){
           System.out.println("Guess a number between 1 and 100: ");
           guess=sc.nextInt();
           numberOfTries++;

           if(guess==guessNumber){
               win=true;
           }
           else if (guess<guessNumber){
               System.out.println();
               System.out.println( "Your guess is too  low!" );
               System.out.println( "Try again!" );
               System.out.println();
           }


           else if(guess>guessNumber){
               System.out.println();   
               System.out.println("Your guess is too  high!");
               System.out.println("Try Again!");
               System.out.println();
           }
       }
      System.out.println("          *************Congratulations! You Win!**************");
      System.out.println();
      System.out.println("The number was: "+guessNumber);
      System.out.println("It took you "+numberOfTries + "tries");
   }
}