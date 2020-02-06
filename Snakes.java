class Snakes
{
    int[] startPositions = {17, 19, 21, 27};
    int[] endingPositions = {4, 7, 9, 1};

    int getEndPosition(int position)
    {
        int number = 0, noofSnakes = startPositions.length;
        while (number < noofSnakes && position != startPositions[number])
        {
            number++;
        }
        position = number != noofSnakes ? endingPositions[number] : position;
        return position;
    }


    void printPositions()
    {
        int noofSnakes = startPositions.length;
        for(int number = 0; number < noofSnakes; number++)
        {
            int startsAt = startPositions[number];
            int endsAt = endingPositions[number];
            System.out.println(startsAt + "--->" + endsAt);
        }
    }
}
