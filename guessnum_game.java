import java.util.Random;
import java.util.Scanner;

class game{
    int bot;
    int player;
    int noOfGuesses=0;

    public int getNoOfGuesses() { return noOfGuesses; }
    public void setNoOfGuesses(int noOfGuesses) { this.noOfGuesses = noOfGuesses; }

    game(){
        Random generate= new Random();
        this.bot= generate.nextInt(101);
    }
    void takeUserInput(){
        System.out.println("Enter yor guess : ");
        Scanner input = new Scanner(System.in);
        this.player = input.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(player==bot){
            System.out.println("You won.");
            System.out.printf("you guessed it in %d tries.",noOfGuesses);
            return true;
        }
        else if (player>bot) {
            System.out.println("Too high...");
        }
        else if (player<bot) {
            System.out.println("Too low...");
        }
        return false;

    }
}

public class guessnum_game{
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b= g.isCorrectNumber();
        }
    }
}
