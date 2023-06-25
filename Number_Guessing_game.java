
import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_game {

    public static void main(String[] args) {
        Random Random_number= new Random();
        int Right_guess = Random_number.nextInt(100);
        int no_of_turns=0;
        Scanner Scan=new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100, You will have total 10 turns to guess! \n" );
        System.out.println("Play the game \nEnter any number \n");


        int Guess;
        int i=0;
        boolean win=false;
        while(!win) {
            Guess=Scan.nextInt();
            no_of_turns++;

            if(Guess==Right_guess) {
                win=true;
            }
            else if(i>9){
                System.out.println("You loose! The right answer was: "+Right_guess);
                return;
            }
            else if(Guess<Right_guess){
                i++;
                System.out.println("Your Guess is lower than the right guess! \nNumber of turns left: " +(10-i) +"\n");
            }
            else {
                i++;
                System.out.println("Your Guess Is Higher Than THe Right Guess! \nNumber of Turns left: " +(10-i) +"\n");
            }
        }
        System.out.println("YOU WIN!");
        System.out.println("Number was "+Right_guess);
        System.out.println("\nYou used "+no_of_turns+" turns to guess the right number");
        System.out.println("Your score is "+((11-no_of_turns)*10)+" out of 100");
    }
}
