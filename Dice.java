import java.util.Random;
class Dice
{
    int getDiceValue()
    {
        Random randomGenerator = new Random();
        int diceValue = randomGenerator.nextInt(6) + 1;
        return diceValue;
    }
}
