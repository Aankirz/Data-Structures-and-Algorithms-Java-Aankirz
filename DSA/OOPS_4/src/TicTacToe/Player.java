package TicTacToe;
     //Player Class
public class Player {
 private String name;
 private char symbol;
   //custom construc.
 Player(String name,char symbol){
     setName(name);

 }
 //getter and setter of name and symbol.
 public void setName(String name ){
     if(!name.isEmpty()){
         this.name=name;
     }
 }
 public String getName(){
     return this.name;
 }
 public void setSymbol(char symbol){
    if(symbol!='\0'){
        this.symbol=symbol;
    }
 }
 public char getSymbol(){
     return this.symbol;
 }
}
