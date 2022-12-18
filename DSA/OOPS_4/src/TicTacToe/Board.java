package TicTacToe;

public class Board {
    //Board(an entity):Properties/ requirements.
   private char board[][]; //rhs part defined in the constructor segment , if not then default.
   private int boardSize=3;
  private char p1Symbol,p2Symbol;
   private int count;//no. of cells of board that has been marked.

    public final static int Player_1_Wins=1;
    public final static int Player_2_Wins=2;
    public final static int Draw=3;
    public final static int Incomplete=4;
    public final static int Invalid=5;
    //now making of custom constructor:

    public Board(char p1Symbol,char p2Symbol){
        board =new char [boardSize][boardSize];
        for (int i=0;i<boardSize;i++){
            for (int j=0;j<boardSize;j++){
                board[i][j]=' ';
            }
        }
        this.p1Symbol=p1Symbol;
        this.p2Symbol=p2Symbol;
    }

    public int move(char symbol, int x, int y) {
    if(x<0||x>=boardSize||y<0||y>=boardSize||board[x][y]!=' ')
        return Invalid;
    board[x][y]=symbol;
    count++;
    //Also to check the status of game after every move.
        //The player wins whose move is.
        if(board[x][0]==board[x][1] &&board[x][0]==board[x][2]){  // Horizontal strike
     return symbol==p1Symbol?Player_1_Wins:Player_2_Wins;// ?: -> if else
        }
        if(board[0][y]==board[1][y] &&board[0][y]==board[2][y]){ //Vertical Strike
            return symbol==p1Symbol?Player_1_Wins:Player_2_Wins;// ?: -> if else)
        }
        //Diagonals (one small case missed : ' ' check blankness)
        if(board[0][0]==board[1][1] &&board[0][0]==board[2][2] && board[0][0]!=' '){ //Diagonal strike \(0,0)(1,1)(2,2)
            return symbol==p1Symbol?Player_1_Wins:Player_2_Wins;// ?: -> if else
        }
        if(board[0][2]==board[1][1] &&board[0][2]==board[2][0]&& board[0][2]!=' '){ //Diagonal strike /(0,2)(1,1)(2,0)
            return symbol==p1Symbol?Player_1_Wins:Player_2_Wins;// ?: -> if else
        }
        //either here player wins or tie.
        if(count==boardSize*boardSize){
            return Draw;
        }
        return Incomplete;
    }
    //Board Fn to print.
    public void print(){
        System.out.println("-----------------");
        for (int i=0;i<boardSize;i++){
            for (int j=0;j<boardSize;j++){
                System.out.print("|"+board[i][j]+"|");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
}
