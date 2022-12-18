public class Node<T> {
   T data;   //<T> - int
   Node<T> next;
   public Node(T data){
       this.data=data;
       next=null;
   }

}








//    public static Node<Integer> takeinput(){
//        Node<Integer> head=null;  //Initialising Head
//
//        Scanner s=new Scanner(System.in); //Taking Input
//        int data=s.nextInt();//Input int
//
//        while(data!=-1){           // loop until -1
//            Node<Integer>newNode=new Node<>(data);//Associating Reference to the input data, so as to Link it.
//
//            if (head==null){
//                head=newNode;//Updating the node of head to the incoming value's  reference and data.
//            }else{
//                Node<Integer>temp=head;
//
//                while(temp.next!=null){   //Because "The last element has data but reference is null"(prop. of last element).
//                     temp=temp.next;
//                }
//
//                temp.next=newNode;
//            }
//            data=s.nextInt();
//        }
//        return head;  //
//    }
