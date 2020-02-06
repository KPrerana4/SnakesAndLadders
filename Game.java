class Game
{
    private Player[] players;
    private Board board;
    private Player currentPlayer;
    private int playersCount, currentPlayerNo, winnerNo;

    Game(int playersCount)
    {
        this.playersCount = playersCount;
        board = new Board();
    }

    void initializePlayers()
    {
        players = new Player[playersCount];
        for (int number = 0; number < playersCount; number++)
        {
            players[number] = new Player(number);
        }
    }

    void start()
    {
        initializePlayers();
        currentPlayer = players[0];
        boolean win;
        do {
            win = performGameSteps();
        }
        while (!win);
        displayWinner();
    }

    boolean performGameSteps()
    {
        int diceValue = getValidDiceValue();
        moveCoin(diceValue);
        boolean win = board.winCheck(currentPlayer.getPosition());
        winnerNo = currentPlayer.id;
        printGameStatus(getPlayerPositions());
        changePlayer();
        return win;
    }

    int getValidDiceValue()
    {
        Dice dice = new Dice();
        int diceValue = currentPlayer.rollDice(dice);
        System.out.println("Player "+(currentPlayer.id + 1)+" dice value:"+diceValue);
        boolean isDiceValueValid;
        int position = currentPlayer.getPosition();
        isDiceValueValid = board.canDiceValueBeUsed(position, diceValue);
        diceValue = isDiceValueValid ? diceValue : 0;
        return diceValue;
    }

    void moveCoin(int diceValue)
    {
        int oldPosition = currentPlayer.getPosition();
        int newPosition;
        newPosition = board.movePlayersCoin(oldPosition, diceValue);
        currentPlayer.setPosition(newPosition);
    }

    void changePlayer()
    {
        int nextPlayerId = currentPlayer.id + 1;
        nextPlayerId %= playersCount;
        currentPlayer = players[nextPlayerId];
    }

    void printGameStatus(int[] playerPositions)
    {
        board.printBoardDetails();
        printPlayersPositions(playerPositions);
        System.out.println();
    }

    void displayWinner()
    {
        System.out.println("Player " + (winnerNo + 1) + " has won");
    }

    int[] getPlayerPositions()
    {
        int[] position = new int[playersCount];
        for (int playerNo = 0; playerNo < playersCount; playerNo++)
        {
            position[playerNo] = players[playerNo].getPosition();
        }
        return position;
    }

    void printPlayersPositions(int[] playerPositions)
    {
        String statement;
        for(int number = 0; number < playersCount ; number++)
        {
            int playerId = number + 1, position = playerPositions[number];
            statement = "Player" +(playerId)+ " current Position:"+ position;
            System.out.println(statement);
        }
    }
}