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
            System.out.println("Enter value between 1 and 6");
            noOfPlayers = read.nextInt();
        }
        while(!(isNoOfPlayersValid()));
    }

    static boolean isNoOfPlayersValid()
    {
        int minimumNoOfPlayers = 1, maximumNoOfPlayers = 6;
        boolean isNoOfPlayersValid;
        boolean isMinimumNoSatisfied, isMaximumNoSatisfied;
        isMinimumNoSatisfied = noOfPlayers >= minimumNoOfPlayers;
        isMaximumNoSatisfied = noOfPlayers <= maximumNoOfPlayers;
        isNoOfPlayersValid = isMinimumNoSatisfied && isMaximumNoSatisfied;
        return isNoOfPlayersValid;
    }
}
