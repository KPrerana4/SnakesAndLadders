class Snakes
{
    int[] startPositions = {17, 19, 21, 27};
    int[] endingPositions = {4, 7, 9, 1};

    int getEndPosition(int position)
    {
        int number = 0, noOfSnakes = startPositions.length;
        while (position != stratPositions[number] && number < noOfSnakes)
        {
            number++;
        }
        position = number != noOfSnakes ? endingPositions[number] : position;
        return position;
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
