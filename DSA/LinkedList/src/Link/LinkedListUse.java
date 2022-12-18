package Link;

import java.util.Scanner;  //Node: data+reference ;

public class LinkedListUse {          //Have clarity in data(as data) and next as a Reference of that data & they both make a node.
//      public static Node<Integer> takeinput(){
//          //Initialising head
//          Node<Integer>head=null,tail=null;  //No data null reference.
//          //Taking Input
//          Scanner s=new Scanner(System.in);
//          int data=s.nextInt();
//
//          while(data!=-1){
//              Node<Integer>NewNode=new Node<>(data);//Making a node form the given data: @150[1,null] (as in the custom constructor)
//              if (head==null) {//needed to make a new head (only once)                     ^  address of the node.
//                  head = NewNode;
//                  tail=NewNode;
//              } else {                      //For 2nd Cycle (data-2),NewNode-@250[2,null]
////                  Node<Integer>temp=head;  // temp=head-> [1,null]  (this will be the new updated head always only once)
////                  while(temp.next!=null){  //temp.next =null(visible)
////                      temp=temp.next;
////                  }//Now In the pre if condition head =NewNode(so complete updation)
////                  temp.next=NewNode;  //But here only temp address got updated
////              }  //temp->[1,@250]
//
//                   tail.next=NewNode;   //so tail is copying the address of NewNode.
//                   tail=NewNode;//or tail=tail.next.  //Because tail updated it's address.
//              }
//              data=s.nextInt();
//          }
//          return head;  //so a linked list gets created.
//            //[1,@250]-->[2,@350]-->[3,null];
//      }

    public static void print(Node<Integer> head){
     Node<Integer>temp=head;    //Basically storing first ref. so to use it again if needed.
        
        while(head!=null){    
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();

    }

//    public static Node<Integer> insert(Node<Integer>head,int data,int pos){
//          Node<Integer>NewNode=new Node<>(data);// making a node of the given data.
//          if (pos==0){
//              NewNode.next=head;
//              head=NewNode;
//              return head;
//          }
//          Node<Integer>temp=head;
//          int i=0;
//          while(i<pos-1){
//              temp=temp.next;
//              System.out.print("s");
//              System.out.print(temp.data+" ");
//              i++;
//          }
//        System.out.print("e");
//          //Very Careful in case of LinkedList.
//        //wrong approach: it would break the linkfrom 30-40;
////        head.next=NewNode;  // now head.next pauses in lhs and runs in rhs.
////         NewNode.next=head.next;
//
//          // In LinkedList ,"Make the Link before you break Them".
//
//        NewNode.next=temp.next; //this head.next ->40
//        System.out.println(temp.data);
////          head.data=data; //don't take care about the data it is the responsibility of NewNode
//        temp.next=NewNode;//this head.next-> 30
//return head;
//    }

    public static void main(String[] args) {
      Node<Integer>head=  takeInput();
     head= insert(head,80,3);
        print(head);


//        Node<Integer> node1=new Node<>(10);
//      //  System.out.println(node1.data);  System.out.println(node1.next);
//
//        Node<Integer> node2=new Node<>(20);
//        node1.next=node2;       //Linking node 1 to node2.
//      //  System.out.println(node2);  System.out.println(node1.next);
//        Node<Integer>node3=new Node<>(30);
//        node2.next=node3;    //node3 refers to its address
//
//        Node<Integer>head=node1;
//        print(head);1


        }

    private static Node<Integer> insert(Node<Integer> head, int data, int pos) {
        if(pos==0&&head!=null){
            Node<Integer>NewNode=new Node<>(data);
            NewNode.next=head;
            head=NewNode;
            return head;
        }
       return insert(head.next,data,pos-1);
    }


    private static Node<Integer> takeInput() {
     Node<Integer>head=null,tail=null;
     Scanner s=new Scanner(System.in);
     int data=s.nextInt();
     while(data!=-1){
         Node<Integer>NewNode=new Node<>(data);
         if(head==null){
             head=NewNode;
             tail=NewNode;
         }else{
             tail.next=NewNode;
             tail=NewNode;
         }
         data=s.nextInt();
     }
     return head;
    }

}

//            DONE</>
