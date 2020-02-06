class Player
{
    String name;
    int position;
    int id;

    Player(int id)
    {
       name = "";
       position = 0;
       this.id = id;
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

    int rollDice(Dice dice)
    {
        int diceValue = dice.getDiceValue();
        return diceValue;
    }
}
