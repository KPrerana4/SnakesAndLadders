class Game
{
    private Player[] players;
    private Board board;
    private Player currentPlayer;
    private int noOfPlayers, currentPlayerNo, winnerNo;

    Game(int noOfPlayers)
    {
        this.noOfPlayers = noOfPlayers;
        initializePlayers();
        board = new Board();
        currentPlayer = players[0];
        currentPlayerNo = 0;
    }

    void initializePlayers()
    {
        players = new Player[noOfPlayers];
        for (int number = 0; number < noOfPlayers; number++)
        {
            players[number] = new Player();
        }
    }

    void play()
    {
        boolean anyOneWon = false;
        do{
           anyOneWon = performGameSteps();
        }
        while(!anyOneWon);
        printWinner();
    }

    boolean performGameSteps()
    {
        int diceValue = getValidDiceValue();
        moveCoin(diceValue);
        boolean anyOneWon = board.winCheck(currentPlayer.getPosition());
        winnerNo = currentPlayerNo;
        printGameDetails();
        changePlayer();
        return anyOneWon;
    }

    int getValidDiceValue()
    {
        Dice dice = new Dice();
        int diceValue = currentPlayer.rollDice(dice, currentPlayerNo);
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
        currentPlayerNo++;
        currentPlayerNo %= noOfPlayers;
        currentPlayer = players[currentPlayerNo];
    }

    void printGameDetails()
    {
        board.printBoardDetails();
        printPlayersPositions();
        System.out.println();
    }

    void printWinner()
    {
        System.out.println("Player " + (winnerNo + 1) + " has won");
    }

    void printPlayersPositions()
    {
        String statement;
        for(int playerNo = 0; playerNo < noOfPlayers; playerNo++)
        {
            int position = players[playerNo].getPosition();
            statement = "Player" +(playerNo+1)+" current Position:"+ position;
            System.out.println(statement);
        }
    }
}