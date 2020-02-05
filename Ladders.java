class Ladders
{
    int[] startPositions = {3, 5, 11, 20};
    int[] endingPositions = {22, 8, 26, 29};

    int getEndPosition(int position)
    {
        int noOfLadders = startPositions.length;
        int number = 0;
        while (position != startPositions[number] && number < noOfSnakes)
        {
            number++;
        }
        position = number != noOfLadders ? endingPositions[number] : position;
        return position;
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