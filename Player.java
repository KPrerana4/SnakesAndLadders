class Player
{
    String name;
    int position;

    Player()
    {
       name = "";
       position = 0;
    }

    void setPosition(int position)
    {
      this.position = position;
    }

    int getPosition()
    {
        return position;
    }

    String getName()
    {
        return name;
    }

    int rollDice(Dice dice, int playerNo)
    {
        int diceValue = dice.getDiceValue();
        System.out.println("Player "+(playerNo + 1)+" dice value:"+diceValue);
        return diceValue;
    }
}
