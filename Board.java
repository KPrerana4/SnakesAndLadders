public class Board
{
    Snakes snakes;
    Ladders ladders;
    int boardMaximumValue;

    Board()
    {
        snakes = new Snakes();
        ladders = new Ladders();
        boardMaximumValue = 30;
    }

    boolean canDiceValueBeUsed(int playerCurrentPosition, int diceValue)
    {
        boolean canValueBeUsed = playerCurrentPosition + diceValue <= boardMaximumValue;
        return canValueBeUsed;
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
        boolean win = playerPosition == boardMaximumValue;
        return win;
    }
}
