class Snakes
{
    int[] startPositions = {17, 19, 21, 27};
    int[] endingPositions = {4, 7, 9, 1};

    int getEndPosition(int playerPosition)
    {
        int number, noOfSnakes = startPositions.length;
        for(number=0; number < noOfSnakes; number++)
        {
            if (playerPosition == startPositions[number])
            {
                return endingPositions[number];
            }
        }
        return playerPosition;
    }


    void printSnakesPositions()
    {
        int noOfSnakes = startPositions.length;
        for(int number = 0; number < noOfSnakes; number++)
        {
            int snakeStartsAt = startPositions[number];
            int snakeEndsAt = endingPositions[number];
            System.out.println(snakeStartsAt + "--->" + snakeEndsAt);
        }
    }
}
