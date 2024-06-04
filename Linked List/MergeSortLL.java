import java.util.*;

public class MergeSortLL {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    

    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }

            while(head2 != null){
                temp.next = head2;
                head1 = head2.next;
                temp = temp.next;
            }
        }

        return mergedLL.next;
    }

    //print
    public void printll(){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node mergeS(Node head){
        if(head == null || head.next == null){
            return head;
        }
       //find mid
       Node mid = getMid(head);

       //left and right ms
       Node rightHead = mid.next;
       mid.next = null;
       Node newLeft = mergeS(head);
       Node newRight = mergeS(rightHead);

       return merge(newLeft, newRight);
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.printll();
        ll.head = ll.mergeS(ll.head);
        ll.printll();

    }
}
