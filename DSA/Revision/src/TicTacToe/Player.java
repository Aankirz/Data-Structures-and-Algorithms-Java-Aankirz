package TicTacToe;
            //Player Entity : has to setup Name , Symbol;
public class Player {
    //First defining data sets private so no one can access
                private String Name;
                private char Symbol;

                //Defining custom constructors
               public  Player(String Name,char Symbol){
this.Name=Name;
this.Symbol=Symbol;
                }

                //Fn it can perform: getname/symbol ,setname/symbol(what we expect it to perform).
                //Getters and Setters
                //Think with the perspective of one Player
                public String getName(){
                   return this.Name;
                }
                public void setName(String Name){
                   if(!Name.isEmpty()){
                       this.Name=Name;
                   }
                }
                public char getSymbol(){
                   return this.Symbol;
                }
                public void setSymbol(char Symbol){
                   if(Symbol!='\0'){
                       this.Symbol=Symbol;
                   }
                }


}
