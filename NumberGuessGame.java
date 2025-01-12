import java.util.*;
import java.util.Random;

class NumberGuessGame{
   public static void main(String[] args){
      Scanner shub=new Scanner(System.in);
      Random r=new Random();

      int roundsPlayed=0;
      int roundsWon=0;

      System.out.println("****Welcome to the Number Guessing Game!*****");


      do{
         roundsPlayed++;
         int guessNumber=r.nextInt(100)+1;

         int maxAttempts=5;

         boolean isGuessCorrect=false; 

         System.out.println("Rund "+roundsPlayed+" : ");
         System.out.println("I have generated a number between 1 to 100..");
         System.out.println("Cany you guess the number?");
         System.out.println("You have "+maxAttempts+" attempts..");

         for(int attempt=1;attempt<=maxAttempts;attempt++){
            System.out.println("Attempt "+attempt+" Enter guess : ");
            int userGuess=shub.nextInt();

            if(userGuess==guessNumber){
               System.out.println("***Congratulations!! You guessed the number correctly...");
               isGuessCorrect=true;
               roundsWon++;
               break;
            }else if(userGuess<guessNumber){
               System.out.println("Too low!");
            }else{
               System.out.println("Too High!");
            }
         }

         if(!isGuessCorrect){
            System.out.println("Sorry you have used all attempts. The correct number was : "+guessNumber);
         }
         System.out.println("Do you want to play another round?(yes/no) : ");
      }while(shub.next().equalsIgonreCase("yes"));
      System.out.println("Game Over!");
      System.out.println("Rounds Plyead : "+roundsPlayed);
      System.out.println("Runds Woned : "+roundsWon);
      
   }
}