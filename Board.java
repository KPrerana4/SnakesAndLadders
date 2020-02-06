public class Board
{
    SnakesAndLadders snakes;
    SnakesAndLadders ladders;
    int boardMaximumValue;

    Board()
    {
        int[] snakesStart = {17, 19, 21, 27};
        int[] snakesEnd =  {4, 7, 9, 1};
        snakes = new SnakesAndLadders(snakesStart, snakesEnd);
        int laddersStart = {3, 5, 11, 20};
        int laddersEnd = {22, 8, 26, 29};
        ladders = new SnakesAndLadders(laddersStart, laddersEnd);
        boardMaximumValue = 30;
    }

    boolean canDiceValueBeUsed(int playerCurrentPosition, int diceValue)
    {
        return playerCurrentPosition + diceValue <= boardMaximumValue;
    }

    int movePlayersCoin(int playerPosition, int diceValue)
    {
        int newPosition = playerPosition + diceValue;
        newPosition = ladders.getEndPosition(newPosition);
        newPosition = snakes.getEndPosition(newPosition);
        return newPosition;
    }

    void printBoardDetails()
    {
        System.out.println("Snakes Positions:");
        snakes.printSnakesPositions();
        System.out.println("Ladders Positions:");
        ladders.printLaddersPositions();
    }

    boolean winCheck(int playerPosition)
    {
        return playerPosition == boardMaximumValue;
    }
}
