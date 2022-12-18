
import java.util.ArrayList;

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char Data){
        this.data=Data;
        isTerminating=false;
children=new TrieNode[26];
childCount=0;
    }
}
public class Trie {
              //only one class can be public
    //now every element of trie is a trie node and root has no data;
   private TrieNode root;  //only used by us.
    public Trie(){
        root=new TrieNode('\0');  //"\0 means null"
    }
    private boolean search(TrieNode root,String word) { //only accessed by me means in this class.
        if (word.length() == 0) {
            if(root.isTerminating){  //is terminating important.
                return true;
            } else{
                return false;
            }
        }   //one letter
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];//assuming it's there
        if (child == null) { //if it's not
            return false;
        }
      return   search(child,word.substring(1));

    }
    public boolean search(String word){

       //Again same thing since we are using recursion so need to send children using root so another constructor.
      return   search(root,word);
    }

    private void add(TrieNode root,String word){
       //Base Case
        if(word.length()==0){
            root.isTerminating=true;
            return;
        }
        int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];//first assuming it exists in root.
        if(child==null){ //then search and if not inserted.
            child=new TrieNode(word.charAt(0));
            root.children[childIndex]=child;
            root.childCount++;

        }
        //Recursion sending child as root N-< and ote.
        add(child,word.substring(1));
    }
    public void add(String word){  //to add it will search one by one if not then insert word one by one but shares.
        //assuming only for small case letters.
        //first findinf first letter in root from it's ascii value;   Ex.:note.

   add(root,word);//one mistake on recursion that again o gets added on root, because I need to add/search in n.
//so sending it to another fn.
    }
public void remove(String word){
    remove(root, word);
}
    public void remove(TrieNode root,String word){
        if(word.length()==0){
            root.isTerminating=false;  //now we are only making it non terminating but not deleting it from space.
            return;
        }
int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];
       if(child==null){
           return;
       }
        remove(child,word.substring(1));
        //we can delete child node only if it has no child and it' non terminating.
        if(!child.isTerminating&&child.childCount==0){
            root.children[childIndex]=null;
            root.childCount--;
        }
//     if(!child.isTerminating){
//         int numChild=0;
//         for(int i=0;i<26;i++){
//             if(child.children[i]!=null){ //necessary because we have initialised it with null;
//                 numChild++;
//             }
//         }
//         if(numChild==0){
//             //we can delete child;
//             root.children[childIndex]=null;
//             root.childCount--;
//             child=null;
//         }
//     }
    }

    public boolean palindromeCompare(String s1,String s2){

        for (int i=0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)!=s2.charAt(s2.length()-1)){
                return false;
            }
        }
        return true;
    }
    public boolean isPalindromeSingle(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public boolean isPalindromePair(ArrayList<String> words) {
        for(int i=0;i< words.size();i++){
            if(isPalindromeSingle(words.get(i))){

                return true;
            }
        }
        for(int i=0;i<words.size();i++){

            String s1= words.get(i);
            for (int j=i+1;j< words.size();j++){
               if (palindromeCompare(s1, words.get(j))){
                   return true;
               }
            }
        }
        return false;
    }


    public boolean patternMatching(ArrayList<String> vect, String pattern) {
         for (int i=0;i<vect.size();i++){
             if (vect.get(i).contains(pattern)){
                 return true;
             }
         }
         return false;
    }

    public void printAutoComplete(String s, String word){
        if (s.length()<word.length()){
            return;
        }
        for (int i=0;i<word.length();i++){
            if(word.charAt(i)!=s.charAt(i)){
                return;
            }
        }
        System.out.println(s);
    }
    public void autoComplete(ArrayList<String> input, String word) {
    for (int i=0;i< input.size();i++){
        printAutoComplete(input.get(i),word );
    }

    }
}
