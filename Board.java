public class Board
{
    Snakes snakes;
    Ladders ladders;
    int maximumValue;

    Board()
    {
        snakes = new Snakes();
        ladders = new Ladders();
        maximumValue = 30;
    }

    boolean validate(int playerCurrentPosition, int diceValue)
    {

        boolean isValid = playerCurrentPosition + diceValue <= maximumValue;
        return isValid;
    }

    int movePlayersCoin(int playerPosition, int diceValue)
    {
        int newPosition = playerPosition + diceValue;

        newPosition = snakes.checkForSnakes(newPosition);
        newPosition = ladders.checkForLadders(newPosition);
        return newPosition;
    }

    void printBoardDetails()
    {
        snakes.printSnakesPositions();
        ladders.printLaddersPositions();
    }

    boolean winCheck(int playerPosition)
    {
        boolean win = playerPosition == maximumValue;
        return win;
    }
}
