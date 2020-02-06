import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter number of players:");
        int playersCount = getPlayersCount();
        Game game = new Game(playersCount);
        game.start();
    }

    static int getPlayersCount()
    {
        int playersCount;
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("Enter value between 1 and 6");
            playersCount = read.nextInt();
        }
        while(!(isPlayersCountValid(playersCount)));
        return playersCount;
    }

    static boolean isPlayersCountValid(int playersCount)
    {
        int minimumNoOfPlayers = 1, maximumNoOfPlayers = 6;
        boolean isMinimumNoSatisfied, isMaximumNoSatisfied;
        isMinimumNoSatisfied = playersCount >= minimumNoOfPlayers;
        isMaximumNoSatisfied = playersCount <= maximumNoOfPlayers;
        return isMinimumNoSatisfied && isMaximumNoSatisfied;
    }
}
