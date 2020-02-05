class Dice
{
    int getDiceValue()
    {
        int maximumValue = 7;
        int diceMinimumValue = 1;
        int diceValue = (int)(maximumValue * Math.random());
        diceValue += diceMinimumValue;
        return diceValue;
    }
}
