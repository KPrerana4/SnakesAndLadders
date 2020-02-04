class Snakes
{
    int[] startPositions = {17, 19, 21, 27};
    int[] endPositions = {4, 7, 9, 1};

    int checkForSnakes(int playerPosition)
    {
        int number, noOfSnakes = startPositions.length;
        for(number=0; number<noOfSnakes; number++)
        {
            if(playerPosition == startPositions[number])
            {
                playerPosition = endPositions[number];
                break;
            }
        }
        return playerPosition;
    }

    void printSnakesPositions()
    {
        System.out.println("Snakes Positions:");
        int noOfSnakes = startPositions.length;
        for(int number = 0; number < noOfSnakes; number++)
        {
            System.out.println(startPositions[number] + "---->" + endPositions[number]);
        }
    }
}
