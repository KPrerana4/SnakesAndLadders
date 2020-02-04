import java.util.Scanner;
class SnakesAndLaddersGame
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number of players(no. of players should be between 1 nad 6):");
        int noOfPlayers ;
        do {
            noOfPlayers = read.nextInt();
        }while(!(noOfPlayers > 0 && noOfPlayers < 7));
        Game controller = new Game(noOfPlayers);
        controller.game();
    }
}
