package TicTacToe;

import java.util.*;

//Game Manager which conducts the game
    //for conduction (smooth) we need to define entities and these to be a class which sets up the game.
public class TicTacToe {
                 //Defining datasets with variables or the entities needed by game manager.
              private Player p1,p2;
              private Board board; //we need player and board

              //Using default custom construc
              //Fn to conduct game.
              public void startGame(){
                  Scanner s=new Scanner(System.in);
                  p1=takeInput(1);
                  p2=takeInput(2);


              }

    private Player takeInput(int num) {
        System.out.println("Enter Player"+num+"'s name");
         Scanner s=new Scanner(System.in);
         String name=s.nextLine();
        System.out.println("Enter Player"+num+"'s Symbol");
        char symbol=s.next().charAt(0);
        Player p=new Player(name,symbol);
        return p;
    }
}
