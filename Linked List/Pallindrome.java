import java.util.*;

public class Pallindrome{
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

    //add element at first
    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //newnode next = head // linking step
        newNode.next = head;
        
        //head = newNode
        head = newNode;

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

    //find mid node -- SLOW FAST APPROACH
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next == null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPallindrome(){
        if(head == null || head.next != null){
            return true;
        }
        // s1 fid mis
        Node midNode = findMid(head); 

        // s2 reverse 2nd half
        Node curr = midNode;
        Node prev = null;


        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr; 
            curr= next;
        }
        Node right = prev;//right half head
        Node left = head;

        //s3 check left = right
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left= left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printll();
        System.out.println(ll.isPallindrome());
    }
}