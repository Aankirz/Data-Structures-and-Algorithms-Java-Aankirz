package TicTacToe;

import java.util.Scanner;

//Final Game class, after defining all entities/classes of this game.
public class TicTacToe {
    private Player player1,player2;
    private Board board;

    public void startGame(){
        Scanner s=new Scanner(System.in);
        //Players input: for each player
        player1=takeInput(1);
        player2=takeInput(2);
        while(player1.getSymbol()==player2.getSymbol()){
            System.out.println("Symbol Already taken !! Pick another symbol !!");
            char symbol=s.next().charAt(0);
            player2.setSymbol(symbol);
            //but we have to make it while rather than if.
        }
        //Create board
        board=new Board(player1.getSymbol(),player2.getSymbol());
        //Conduct game
        //iterative
        boolean player1turn=true; //indicator to alternate turn.
        int status=Board.Incomplete;
        while(status==Board.Incomplete||status==Board.Invalid) {
            if (player1turn) {
                //take input/move from p1;
                System.out.println("Player-1" + player1.getName() + "'s turn");

                    System.out.println("Enter x:");
                    int x = s.nextInt();
                    System.out.println("Enter y:");
                    int y = s.nextInt();
                    //now after getting coord, will take the move(computer):
                    //status of game.
                    status = board.move(player1.getSymbol(), x, y); //incmpt:win,invalid move.
                    if (status != Board.Invalid) {
                        player1turn = false;
                        board.print();
                    } else {
                        System.out.println("Invalid Move !! Try Again !!");
                    }
                }else{
                    System.out.println("Player-2" + player2.getName() + "'s turn");

                        System.out.println("Enter x:");
                        int x = s.nextInt();
                        System.out.println("Enter y:");
                        int y = s.nextInt();
                        //now after getting coord, will take the move(computer):
                        //status of game.
                        status = board.move(player2.getSymbol(), x, y); //incmpt:win,invalid move.
                        if (status != Board.Invalid) {
                            player1turn = true;
                            board.print();
                        }else {
                            System.out.println("Invalid Move !! Try Again !!");
                        }
                    }

                }
                 //after while loop
        if(status==Board.Player_1_Wins){
            System.out.println("Player 1-"+ player1.getName()+"'WINS");
        }else if(status==Board.Player_2_Wins){
            System.out.println("Player 1-"+ player1.getName()+"'WINS");
        }else{
            System.out.println("Draw");
        }
            }

                private Player takeInput ( int num){
                    Scanner s = new Scanner(System.in);
                    System.out.println("Enter Player" + num + "name:");
                    String name = s.next();
                    System.out.println("Enter Player" + num + "symbol:");
                    char symbol = s.next().charAt(0);// Way to take char as input.
                    Player p = new Player(name, symbol);
                    return p;
                }
            }

