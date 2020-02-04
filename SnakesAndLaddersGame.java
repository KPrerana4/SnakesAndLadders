import java.util.Scanner;
class SnakesAndLaddersGame
{
    static int noOfPlayers;
    public static void main(String args[])
    {
        System.out.println("Enter number of players:");
        readNoOfPlayers();
        Game game = new Game(noOfPlayers);
        game.play();
    }

    static void readNoOfPlayers()
    {
        Scanner read = new Scanner(System.in);
        do{
            noOfPlayers = read.nextInt();
        }
        while(!(isNoOfPlayersValid()));
    }

    static boolean isNoOfPlayersValid()
    {
        int minimumNoOfPlayers = 1, maximumNoOfPlayers = 6;
        boolean isNoOfPlayersValid;
        boolean minimumNoSatisfied, maximumNoSatisfied;
        minimumNoSatisfied = noOfPlayers >= minimumNoOfPlayers;
        maximumNoSatisfied = noOfPlayers <= maximumNoOfPlayers;
        isNoOfPlayersValid = minimumNoSatisfied && maximumNoSatisfied;
        return isNoOfPlayersValid;
    }
}
