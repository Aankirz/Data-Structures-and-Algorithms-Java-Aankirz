/*Reverse LL (Recursive)
Send Feedback
Given a singly linked list of integers, reverse it using recursion and return the head to the modified list. You have to do this in O(N) time complexity where N is the size of the linked list.
 Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^4
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
Sample Output 1 :
8 7 6 5 4 3 2 1
Sample Input 2 :
2
10 -1
10 20 30 40 50 -1
Sample Output 2 :
10
50 40 30 20 10 */
public class ReverseLL {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static LinkedListNode<Integer> reverseLinkedListA1(LinkedListNode<Integer> head) {
      if(head==null){
          return null;
      }
      if(head.next!=null){
          return head;//USING I/P & O/P WISELY.
      }

      LinkedListNode<Integer>temp=reverseLinkedListA1(head.next);
        //My job
      LinkedListNode<Integer>output=temp;
      while(temp.next!=null){
          temp=temp.next;
      }
      temp.next=head;
      // Crucial Step
        head.next=null;
      return output;

    }
    /* Reverse LL Better*/
    public static LinkedListNode<Integer> reverseLinkedListA2(LinkedListNode<Integer> head) {
        // Pointers Approach
        LinkedListNode<Integer>prev=null,curr=head,fwd=null;
        while (curr!=null){
            fwd=curr.next;

            curr.next=prev;//linking backwards

            prev=curr;// swap
            curr=fwd;
        }
  return prev;
    }


        /* Reverse LL Best*/
    public static LinkedListNode<Integer> reverseLinkedListA3(LinkedListNode<Integer> head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        LinkedListNode<Integer>reversedTail=head.next;
        LinkedListNode<Integer>temp=reverseLinkedListA3(head.next);

        reversedTail.next=head;//Linking Backwards
        head.next=null;

        return temp;

    }

}
