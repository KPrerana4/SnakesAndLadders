class Ladders
{
    int[] startPositions = {3, 5, 11, 20};
    int[] endPositions = {22, 8, 26, 29};

    int checkForLadders(int playerPosition)
    {
        int number, noOfLadders = startPositions.length;
        for(number=0; number<noOfLadders; number++)
        {
            if(playerPosition == startPositions[number])
            {
                playerPosition = endPositions[number];
                break;
            }
        }
        return playerPosition;
    }

    void printLaddersPositions()
    {
        System.out.println("Ladders Positions:");
        int noOfLadders = startPositions.length;
        for(int number = 0; number < noOfLadders; number++)
        {
            System.out.println(startPositions[number] + "---->" + endPositions[number]);
        }
    }
}