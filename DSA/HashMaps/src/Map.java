import java.util.ArrayList;
import java.util.HashMap;

public class Map <K,V>{
ArrayList<MapNode<K,V>>buckets;
int size;   //no. of entries
int numbuckets;//size of bucket

       public Map(){
     numbuckets=20;
     buckets=new ArrayList<>();
     for (int i=0;i<20;i++){
        buckets.add(null);
    }
}
            //hash function or Get bucket index (Key-> corresponding bucket index)  that's why private
private  int getBucketIndex(K key){
           //First we need to find hashcode (bana banaya for generic data)
           int hashCode=key.hashCode(); //default object(parent)(Already it has a hash code fn , Because every generic data's parent has  a hashcode)
    //then compress
    return hashCode % numbuckets;
}
     public void insert(K key,V value){
           //we need to convert key to value using hashcode function.
         //First thing to do is to figure out to send key in which bucket index, using hashcode fn.
        int bucketIndex=getBucketIndex(key);
        //Now taking out head of LL and traverse it and will see whether it has the data or not and if not then create another node.
         MapNode<K,V>head=buckets.get(bucketIndex);  //Creating a node from the element in array list and making it head;

         //Traversing LL;
         while(head!=null){   //not using ==(memory location) so for content comparison using .equals(but by default ==)
             if (head.key.equals(key)){  //Now if head.data == given data then no need to traverse just update the value;
                 head.value=value;
                 return;
             }
             head=head.next;
         }
         //But if we reach head==null then it means it doesn't have the key provided now and so we need to creat a new node and attach it.;
         MapNode<K,V>NewElementNode=new MapNode<>(key,value);  //making it a new head;
         head= buckets.get(bucketIndex); //since it was in null
         NewElementNode.next=head;
       buckets.set(bucketIndex,NewElementNode);
     }

     //Size F(n)
    public int size(){
           return size;
    }
     // Search F(n)
    public V getValue(K key){  //return the value corresponding to specific key.
             //First thing we need to do is to get the bucket index
        int bucketIndex=getBucketIndex(key);//using hashcode fn
        //Now getting the head of LL in that bucketIndex
        MapNode<K,V>head= buckets.get(bucketIndex);//accessing element of bucket using index.
        while(head!=null){
            if (head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
return null;
    }
    //Delete F(n)
public V removeKey(K key){
           int bucketIndex=getBucketIndex(key);
           MapNode<K,V>head= buckets.get(bucketIndex);
           MapNode<K,V>prev=null;
           while(head!=null){
               if (head.key.equals(key)){
                   if (prev==null){
                       buckets.set(bucketIndex,head.next);//so jo bhi mera bucket index tha wahan pe head ke next element pe bitha dena hein.
                   }else{
                       prev.next=head.next;
                   }
                   return head.value;        //ALMOST CORRECT (BUT IF WE GOT HEAD AS THE KEY)
               }
               prev=head;
               head=head.next;
           }
           return null;
}
}
