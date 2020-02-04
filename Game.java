class Game
{
    Player[] players;
    Dice dice;
    Board board;
    Player currentPlayer;
    int noOfPlayers, currentPlayerNo;
    int winnerPlayerNo;

    Game(int noOfPlayers)
    {
        this.noOfPlayers = noOfPlayers;
        players = new Player[noOfPlayers];
        for(int number = 0; number < noOfPlayers; number++)
        {
           players[number] = new Player();
        }
        dice = new Dice();
        board = new Board();
        currentPlayer = players[0];
        currentPlayerNo = 0;
    }

    void game()
    {
        boolean win = false;
        do{
           int diceValue = currentPlayer.rollDice(dice, currentPlayerNo) ;
           boolean isDiceValueValid = board.validate(currentPlayer.position, diceValue);
           if(isDiceValueValid) {
               currentPlayer.position = board.movePlayersCoin(currentPlayer.position, diceValue);
               win = board.winCheck(currentPlayer.position);
               winnerPlayerNo = currentPlayerNo;
           }
           printDetails();
           changePlayer();
        }while(!win);
        printWinner();
    }

    void changePlayer()
    {
        currentPlayerNo++;
        currentPlayerNo %= noOfPlayers;
        currentPlayer = players[currentPlayerNo];
    }

    void printDetails()
    {
        board.printBoardDetails();
        printPlayersPositions();
        System.out.println();
    }

    void printWinner()
    {
        System.out.println("Player " + (winnerPlayerNo + 1) + " has won");
    }

    void printPlayersPositions()
    {
        int position, playerNo;
        for(playerNo = 0; playerNo < noOfPlayers; playerNo++)
        {
            position = players[playerNo].position;
            System.out.println("Player " + (playerNo + 1) + "'s current Position =" + position);
        }
    }
}