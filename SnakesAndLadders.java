class SnakesAndLadders
{
    int[] startPositions;
    int[] endingPositions;

    SnakesAndLaddres(int[] startPositions,int[] endingPositions)
    {
        this.startPositions =  startPositions;
        this.endingPositions = endingPositions;
    }

    int getEndPosition(int position)
    {
        int number = 0, totalCount = startPositions.length;
        while (number < totalCount && position != startPositions[number])
        {
            number++;
        }
        position = number != totalCount ? endingPositions[number] : position;
        return position;
    }


    void printPositions()
    {
        int totalCount = startPositions.length;
        for(int number = 0; number < totalCount; number++)
        {
            int startsAt = startPositions[number];
            int endsAt = endingPositions[number];
            System.out.println(startsAt + "--->" + endsAt);
        }
    }
}
