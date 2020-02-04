class Ladders
{
    int[] startPositions = {3, 5, 11, 20};
    int[] endingPositions = {22, 8, 26, 29};

    int getEndPosition(int playerPosition)
    {
        int number, noOfLadders = startPositions.length;
        for(number=0; number<noOfLadders; number++)
        {
            if(playerPosition == startPositions[number])
            {
                return endingPositions[number];
            }
        }
        return playerPosition;
    }

    void printLaddersPositions()
    {
        int noOfLadders = startPositions.length;
        for(int number = 0; number < noOfLadders; number++)
        {
            int ladderStartsAt = startPositions[number];
            int ladderEndsAt = endingPositions[number];
            System.out.println(ladderStartsAt + "---->" + ladderEndsAt);
        }
    }
}