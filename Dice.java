class Dice
{
    int getDiceValue()
    {
        int diceMaximumValue = 6;
        int diceMinimumValue = 1;
        int diceValue = (int)(diceMaximumValue * Math.random());
        return diceValue + diceMinimumValue;
    }
}
